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
  
  final <T extends ParserRuleContext>  DiagramGenerator recurse(T ctx) {
    //out.println(depth + ": "+ ctx.getClass().getSimpleName());
    depth ++;
    visitChildren(ctx);
    depth--;
    return this;
  }
  
  final void section(Runnable r) {
    emit("{");
    depth++;
    r.run();
    depth--;
    emit("}");
  }
}
