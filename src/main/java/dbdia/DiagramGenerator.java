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
import java.util.LinkedList;

import org.antlr.v4.runtime.ParserRuleContext;

import dbdia.antlr.DSLBaseVisitor;

abstract class DiagramGenerator extends DSLBaseVisitor<Void> {
  int depth = 0;
  final LinkedList<String> parent = new LinkedList<>();
  final PrintStream out; 
  final DiagramType typeOfDiagram;
  
  DiagramGenerator(PrintStream out, DiagramType typeOfDiagram) {
    this.out = out; 
    this.typeOfDiagram = typeOfDiagram;
  }

  final DiagramGenerator emit(Object... args) {
    for (int i=0; i < depth;i++) out.print("  ");
    for (Object a: args) {
      out.print(a);
    }
    out.println();
    return this;
  }
  
  final <T extends ParserRuleContext> void recurse(T ctx) {
    //out.println(depth + ": "+ ctx.getClass().getSimpleName());
    depth ++;
    visitChildren(ctx);
    depth--;
  }
  
  final void section(Runnable r) {
    emit("{");
    depth++;
    r.run();
    depth--;
    emit("}");
  }
}
