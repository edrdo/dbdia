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

import java.io.IOException;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import dbdia.antlr.*;

/**
 * Parser test program (used for debugging).
 */
public class ParserTest {
  static class PL implements ParseTreeListener {

    int depth = 0;
    
    void indent() {
      for (int i= 0; i < depth; i++) System.out.print(' '); 
    }
    
    @Override
    public void visitTerminal(TerminalNode node) {
      indent();
      System.out.printf("  '%s'%n", node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
      indent();
      System.out.println("ERROR "+ node);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
      indent();
      System.out.println(">> " + ctx.getClass().getSimpleName());
      depth++;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
      depth--;
      indent();
      System.out.println("<< " + ctx.getClass().getSimpleName());
    }
    
  }
  public static void main(String[] args) throws IOException {
    DSLLexer lexer = new DSLLexer(CharStreams.fromFileName(args[0], Charset.forName("UTF-8")));
    DSLParser parser = new DSLParser(new CommonTokenStream(lexer));
    ParserErrorStrategy pes = new ParserErrorStrategy();
    parser.setErrorHandler(pes);
    parser.addParseListener(new PL());
    @SuppressWarnings("unused")
    DSLParser.RootContext root = parser.root();
    int errors = pes.getErrorCount();
    if (errors != 0) {
      System.err.printf("%s: %d syntax errors%n", args[0], errors);
      System.exit(1);
    }
  }
}
