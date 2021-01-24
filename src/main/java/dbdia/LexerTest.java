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

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import dbdia.antlr.*;

/**
 * Lexical analyzer test program (used for debugging).
 */
public class LexerTest {
  public static void main(String[] args) throws IOException {
    DSLLexer lexer = new DSLLexer(CharStreams.fromFileName(args[0]));
    Token t;
    do {
      t = lexer.nextToken();
      System.out.printf("Line %d Pos %d | Type: %s Text: '%s' str: '%s'\n", 
                        t.getLine(), 
                        t.getCharPositionInLine(), 
                        t.getType(),
                        t.getText(),
                        t.toString());
    } while (t.getType() != Token.EOF);
  }
}
