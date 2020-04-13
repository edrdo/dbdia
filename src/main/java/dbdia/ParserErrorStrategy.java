package dbdia;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Customization for parse error  handling.
 */
class ParserErrorStrategy extends DefaultErrorStrategy {
  private int errors = 0; 
  
  public int getErrorCount() {
    return errors; 
  }
  
  @Override
  protected void reportUnwantedToken(Parser recognizer) {
    if (! inErrorRecoveryMode(recognizer)) {
      super.reportUnwantedToken(recognizer);
      errors ++;
    }
  }
  
  @Override
  public void reportError(Parser recognizer, RecognitionException e) {
    if (! inErrorRecoveryMode(recognizer)) {
      super.reportError(recognizer, e);
      errors ++;
    }
  }
}
