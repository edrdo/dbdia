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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import dbdia.antlr.*;
import dbdia.antlr.DSLParser.RootContext;

/**
 * Semantic checker.
 */ 
final class Checker {

  private int errors  = 0;

  private final DSLBaseVisitor<Void> visitor = new DSLBaseVisitor<Void>() {

    private final LinkedList<Scope> scopes = new LinkedList<>();
    private final LinkedHashMap<String,Token> deferred = new LinkedHashMap<>();

    private void check(Token identifier) {
      if (! scopes.peek().isDefined(identifier)) {
        deferred.put(identifier.getText(), identifier);
      }
    }

    private void define(Token identifier) {
      if (! scopes.peek().define(identifier)) {
        System.err.printf("line %d:%d '%s' can not be defined again%n",
            identifier.getLine(), identifier.getCharPositionInLine(), identifier.getText());
        errors ++;
      }
    }

    @Override
    public Void visitRoot(DSLParser.RootContext root) {
      Scope s = recurse(root, "");
      for (Entry<String,Token> e : deferred.entrySet()) {
        if (! s.isDefined(e.getKey())) {
          System.err.printf("line %d:%d '%s' is not defined%n",
              e.getValue().getLine(), e.getValue().getCharPositionInLine(), e.getKey());
          errors++;
        }
      }
      return null;
    }

    @Override
    public Void visitEntity(DSLParser.EntityContext e) { 
      define(e.name);
      recurse(e, e.name.getText()); 
      return null;
    }
    

    @Override
    public Void visitWeakEntity(DSLParser.WeakEntityContext we) { 
      check(we.parent_entity);
      define(we.idrel);
      return visitEntity(we.dependent_entity);
    }

    @Override
    public Void visitRelationship(DSLParser.RelationshipContext r) { 
      check(r.entityA);
      check(r.entityB);
      define(r.name);
      return null;
    }

    @Override 
    public Void visitCompositeField(DSLParser.CompositeFieldContext cf) { 
      define(cf.name);
      recurse(cf, cf.name.getText());
      return null;
    }

    @Override
    public Void visitSimpleField(DSLParser.SimpleFieldContext sf) {
      define(sf.name);
      return null;
    }
    
    @Override
    public Void visitOptionalField(DSLParser.OptionalFieldContext of) {
      define(of.name);
      return null;
    }
    
    @Override
    public Void visitDerivedField(DSLParser.DerivedFieldContext df) {
      define(df.name);
      return null;
    }

    @Override 
    public Void visitTableDefinition(DSLParser.TableDefinitionContext td) { 
      define(td.name);
      recurse(td, td.name.getText());
      return null;
    }
    
    @Override 
    public Void visitTableField(DSLParser.TableFieldContext tf) { 
      if (tf.ref != null) {
        deferred.put(tf.ref.table.getText() + "." + tf.ref.field.getText(), tf.ref.table);
      }
      return visitChildren(tf);
    }
    
    @Override 
    public Void visitTableKeyField(DSLParser.TableKeyFieldContext tkf) { 
      define(tkf.name);
      return null;
    }
    
    @Override 
    public Void visitTableOptionalField(DSLParser.TableOptionalFieldContext tof) { 
      define(tof.name);
      return null;
    }
    
    @Override 
    public Void visitTablePlainField(DSLParser.TablePlainFieldContext tpf) { 
      define(tpf.name);
      return null;
    }

    private <T extends ParserRuleContext> Scope recurse(T ctx, String namespace) {
      Scope curr = scopes.peek();
      Scope s = new Scope(curr != null ? curr.namespace + "." + namespace : namespace);
      scopes.push(s);
      visitChildren(ctx);
      scopes.pop();
      if (curr != null) {
        curr.symbols.putAll(s.symbols);
      }
      return s;
    }
  };

  private static final class Scope {
    final HashMap<String, Token> symbols = new HashMap<>();
    final String namespace;

    public Scope(String namespace) {
      this.namespace = namespace;
    }

    boolean define(Token id) {
      return symbols.putIfAbsent(namespace + "." + id.getText(), id) == null;
    }

    boolean isDefined(Token id) {
      return symbols.containsKey(namespace + "." + id.getText());
    }
    
    boolean isDefined(String id) {
      return symbols.containsKey(namespace + "." + id);
    }
  }

  public int verify(RootContext root) {
    visitor.visit(root);
    return errors;
  }
}
