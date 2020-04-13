package dbdia;

import java.io.IOException;

/**
 * Utility class for executing shell commands.
 */
public final class Shell {
  @SafeVarargs
  static int execute(String... args) {
    try {
      return new ProcessBuilder(args).inheritIO().start().waitFor();
    } catch (InterruptedException | IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  private Shell() { }
}
