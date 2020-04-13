package dbdia;

import java.io.PrintStream;

import dbdia.antlr.DSLParser;
import dbdia.antlr.DSLParser.RelationalSchemaContext;
import dbdia.antlr.DSLParser.TableDefinitionContext;
import dbdia.antlr.DSLParser.TableFieldBaseDefContext;
import dbdia.antlr.DSLParser.TableFieldContext;
import dbdia.antlr.DSLParser.TableFieldTypeInfoContext;


/**
 * Relational schema diagram generator.
 */
class SchemaDiagramGenerator extends DiagramGenerator {
  public SchemaDiagramGenerator(PrintStream out, DiagramType typeOfDiagram) {
    super(out, typeOfDiagram);
  }

  @Override
  public Void visitRelationalSchema(RelationalSchemaContext rs) {
    emit("digraph");
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
        emit(sec, " [ ");
        for (Options o : nodeAndEdgeOpts) {
          if (! o.value.isEmpty()) {
            emit("  ", o.toString(), "=\"", o.value, "\"");
          }
        }
        emit("]");
      }
      visitChildren(rs);
    });
    return null;
  }
  
  @Override
  public Void visitTableDefinition(TableDefinitionContext td) {
    String name = td.name.getText();
    emit(name, " [ ", Dot.Shape.TABLE, " label=<");
    emit("<table border='0' cellborder='1' cellspacing='0'>");
    emit("  <tr><td align='left'><b>", name, "</b></td></tr>");
    for (TableFieldContext tf : td.tableField()) {
      visitChildren(tf);
    }
    emit("</table>");
    emit(">");
    emit("];");
    for (TableFieldContext tf : td.tableField()) {
      if (tf.ref != null) {
        emit(name, ":", tf.field.nameOfField,
             " -> ", 
             tf.ref.table.getText(), ":",  tf.ref.field.getText(),
             " [ fillcolor=\"", Options.color.value, "\" ]");
      }
    }
    return null;
  }
  
  private Void emitField(String name, String label, TableFieldBaseDefContext tf) {
    TableFieldTypeInfoContext ti = ((TableFieldContext) (tf.getParent())).type;
    String typeInfo =  ti != null  ? " <i>" + ti.type.getText() + "</i>" : "";
    emit("  <tr><td align='left' port='", name, "'>", label, typeInfo, "</td></tr>");
    return null;
  }
  
  @Override 
  public Void visitTableKeyField(DSLParser.TableKeyFieldContext tkf) { 
    return emitField(tkf.nameOfField, "<u>" + tkf.nameOfField + "</u>", (TableFieldBaseDefContext) tkf.getParent());
  }
  
  @Override 
  public Void visitTableOptionalField(DSLParser.TableOptionalFieldContext tof) { 
    return emitField(tof.nameOfField, tof.nameOfField + " ?", (TableFieldBaseDefContext) tof.getParent());
  }
 
  @Override 
  public Void visitTablePlainField(DSLParser.TablePlainFieldContext tpf) { 
    return emitField(tpf.nameOfField, tpf.nameOfField, (TableFieldBaseDefContext) tpf.getParent());
  }

}
