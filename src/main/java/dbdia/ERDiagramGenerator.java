//
// Copyright Eduardo R. B. Marques
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package dbdia;

import java.io.PrintStream;

import dbdia.antlr.DSLParser;

/**
 * Entity-relationship diagram generator.
 */
class ERDiagramGenerator extends DiagramGenerator {
  public ERDiagramGenerator(PrintStream out, DiagramType typeOfDiagram) {
    super(out, typeOfDiagram);
  }

  boolean includeEntityAttributes() {
    return typeOfDiagram == DiagramType.er || typeOfDiagram == DiagramType.ent;
  }

  boolean includeRelationships() {
    return typeOfDiagram == DiagramType.er || typeOfDiagram == DiagramType.rel;
  }

  void fieldNode(String name, String label) {
    fieldNode(name, label, "");
  }

  void fieldNode(String name, String label, String modifiers) {
    name = parent.peek() + "_" + name;
    emit(name, " [ ", Dot.Shape.ATTRIBUTE, " label=", label, " ", modifiers, " ]");
    edge(name, parent.peek());
  }

  ERDiagramGenerator edge(String a, String b) {
    return edge(a, b, "");
  }

  ERDiagramGenerator edge(String a, String b, String modifiers) {
    return (ERDiagramGenerator) emit(a, " -- " , b, " [ ", modifiers , " ] ");
  }

  @Override
  public Void visitKeyField(DSLParser.KeyFieldContext kf) {
    String name = kf.name.getText();
    fieldNode(name, "<<u>" + name + "</u>>", "");
    return null;
  }
  
  @Override
  public Void visitOptionalField(DSLParser.OptionalFieldContext of) {
    String name = of.name.getText();
    fieldNode(name, "\"" + name + " ?\"", "");
    return null;
  }
  
  @Override
  public Void visitDerivedField(DSLParser.DerivedFieldContext df) {
    String name = df.name.getText();
    fieldNode(name, "\"" + name + "\"", Dot.DASHED_STYLE);
    return null;
  }
  
  @Override
  public Void visitSimpleField(DSLParser.SimpleFieldContext sf) {
    String name = sf.name.getText();
    fieldNode(name,  "\"" + name + "\"", 
           sf.getParent() instanceof DSLParser.MultivalueFieldContext ? 
             Dot.DOUBLE_OUTLINE : "");
    return null;
  }

  @Override 
  public Void visitCompositeField(DSLParser.CompositeFieldContext cf) { 
    String name = cf.name.getText();
    fieldNode(name, "\"" + name + "\"", 
        cf.getParent() instanceof DSLParser.MultivalueFieldContext ?
            Dot.DOUBLE_OUTLINE : "");
    section(() -> { 
      parent.push(parent.peek() + "_" + name);
      visitChildren(cf);
      parent.pop();
    });
    return null;
  }


  @Override
  public Void visitEntity(DSLParser.EntityContext e) {
    String eid = e.name.getText();
    String mod = e.getParent() instanceof DSLParser.WeakEntityContext ?
        Dot.DOUBLE_OUTLINE : "";
    emit(Dot.SUBGRAPH_CLUSTER, eid);
    section(() -> {
      emit(Dot.INVISIBLE_STYLE);
      emit(eid, " [ ", Dot.Shape.ENTITY, " label=\"" + eid + "\" ", mod, " ]");
      if (includeEntityAttributes()) {
        parent.push(eid);
        visitChildren(e);
        parent.pop(); 
      }
    });
    return null;
  }

  static final String TOTAL_PARTICIPATION = "=";
  static final String PARTIAL_PARTIPATION = "-";

  static RelationshipConstraints rc(String cardinality, String participation) {
    return new RelationshipConstraints(cardinality, participation);
  }

  static RelationshipConstraints rc(DSLParser.RelationshipConstraintsContext rcc) {
    return new RelationshipConstraints(rcc);
  }

  private static class RelationshipConstraints {
    final String cardinality; 
    final String participation;

    RelationshipConstraints(String c, String p) {
      cardinality = c;
      participation = p != null ? p : PARTIAL_PARTIPATION;
    }

    RelationshipConstraints(DSLParser.RelationshipConstraintsContext rcc) {
      this(rcc.card.getText(), rcc.part != null ? rcc.part.getText() : null);
    }
  }

  @Override
  public Void visitWeakEntity(DSLParser.WeakEntityContext e) {
    visitEntity(e.dependent_entity);
    if (includeRelationships()) {
      relationNode(e.idrel.getText(), Dot.DOUBLE_OUTLINE);
      relEdge(e.parent_entity.getText(), 
          e.idrel.getText(), 
          rc("1", e.parent_entity_part.part.getText()));
      relEdge(e.idrel.getText(), 
          e.dependent_entity.ID().getText(), 
          rc("N", TOTAL_PARTICIPATION));
    }
    return null;
  }

  void relationNode(String name, String modifiers) {
    emit(name, " [ ", Dot.Shape.RELATION, " label=\"", name, "\"", modifiers, " ]");
  }

  void relEdge(String a, String b, RelationshipConstraints c) {
    String mod = "label=\"" + c.cardinality + "\"";
    if (c.participation.equals(TOTAL_PARTICIPATION)) {
      mod += ", " + "color=\"" + Options.color.value 
          + ":invis:" + Options.color.value + "\"";  
    }
    edge(a, b, mod);
  }

  @Override
  public Void visitRelationship(DSLParser.RelationshipContext r) {
    if (includeRelationships()) {
      String name = r.name.getText();
      parent.push(name);
      relationNode(name,"");
      relEdge(r.entityA.getText(), name, rc(r.constrA));
      relEdge(name, r.entityB.getText(), rc(r.constrB));
      recurse(r);
      parent.pop();
    }
    return null;
  }

  @Override
  public Void visitEntRelModel(DSLParser.EntRelModelContext erModel) {
    emit(Dot.GRAPH);
    section(() -> {
      Options[] graphOpts = { 
          Options.layout,
          Options.rankdir, 
          Options.clusterrank,
          Options.splines
      };
      for (Options o : graphOpts) {
        if (! o.value.isEmpty()) {
          emit(o.toString(), "=\"", o.value, "\"");
        }
      } 
      Options[] nodeAndEdgeOpts = {
          Options.color,
          Options.fillcolor,
          Options.fontcolor,
          Options.fontname,
          Options.fontsize,
          Options.style
      };
      String[] secs  = { "node", "edge" };
      for (String sec : secs) {
        emit(sec, " [");
        for (Options o : nodeAndEdgeOpts) {
          if (! o.value.isEmpty()) {
            emit("  ", o.toString(), "=\"", o.value, "\"");
          }
        }
        emit("]");
      }
      visitChildren(erModel);
    });
    return null;
  }
}
