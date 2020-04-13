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
