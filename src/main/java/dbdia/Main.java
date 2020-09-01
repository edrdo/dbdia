package dbdia;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import dbdia.antlr.DSLLexer;
import dbdia.antlr.DSLParser;


/**
 * The dbdia program.
 */
public enum Main {

  INSTANCE;


  public static void main(String[] args)  {
    INSTANCE.onMain(args);
  }

  static final String VERSION = "0.3";

  private static final String CHARSET_TO_USE = "UTF-8";
  
  void onMain(String[] args) {
    try {
      parseArguments(args);
      parseInputFile();
      generateDiagram();
    }
    catch(IOException e) {
      System.err.printf("I/O error ocurred: %s -  %s%n", e.getMessage(), e.getClass().getSimpleName());
      System.exit(1);
    }
    catch(RuntimeException e) {
      e.printStackTrace(System.err);
      System.err.printf("Unexpected error ocurred: %s - %s%n", 
          e.getMessage(), e.getClass().getSimpleName());
      System.exit(1);
    }
    System.exit(0);
  }

  DiagramType typeOfDiagram;
  String inputFileName;
  String outputFileName;
  boolean infoMsgs;
  DSLParser.RootContext root;

  void parseArguments(String[] args) {
    // Check for usage invocation
    if (args.length == 1) {
      switch (args[0]) {
        case "help":
          System.err.printf(
              "Usage:%n  dbdia <options> [er|ent|rel|sch] <inputFile> <outputFile>%nOptions:%n");
          for (Options o : Options.values()) {
            System.err.printf("  -%s%n    %-40s%n    Default value: %s%n",
                o.toString() + "=" + o.paramDesc, 
                o.description, 
                o.value);  
          }
          break;
        case "version":
          System.err.println(VERSION);
          break;
        default:
          System.err.printf("Invalid arguments. Execute 'dbdia help' for help.%n");
          System.exit(1);
      }
      System.exit(0);
    }
    // Parse options
    int iArg;
    for (iArg = 0; iArg < args.length && args[iArg].startsWith("-"); iArg++) {
      String[] pair = args[iArg].substring(1).split("=", 2);
      boolean valid = pair.length == 2;
      if (valid) {
        try {
          Options o = Options.valueOf(pair[0]);
          o.value = pair[1];
        }
        catch(IllegalArgumentException e) {
          valid = false;
        }
      }
      if (!valid) {
        System.err.printf("Invalid option '%s'  ...%n", args[iArg]);
        System.exit(1);
      }
    }
    // Check for necessary arguments
    if (args.length - iArg != 3) {
      System.err.printf("Invalid arguments. Please execute 'dbdia help' for help!%n");
      System.exit(1);
    }
    // Validate diagram type
    typeOfDiagram = null;
    try {
      typeOfDiagram = DiagramType.valueOf(args[iArg]);
    } catch(IllegalArgumentException e) {
      System.err.printf("Invalid type of diagram: %s", args[0]);
      System.exit(1);
    }
    // Set variables
    inputFileName = args[iArg + 1];
    outputFileName = args[iArg + 2];
    infoMsgs = Options.info.value.equalsIgnoreCase("yes");
    // Derive output format
    if (Options.format.value.isEmpty()) {
      String[] tmp = outputFileName.split("\\.");
      if (tmp.length < 2) {
        System.err.printf("Output format cannot be guessed!%n");
        System.exit(1);
      }
      Options.format.value = tmp[tmp.length-1];
    }
    if (infoMsgs) {
      System.err.printf("--> Deriving '%s' diagram with '%s' format: '%s' >>> '%s'%n", 
          typeOfDiagram, Options.format.value, inputFileName, outputFileName);
    }
  }

  void parseInputFile() throws IOException{
    if (infoMsgs) {
      System.err.printf("--> Processing input file %s%n", inputFileName);
    }
    // Build parser object
    DSLLexer lexer = new DSLLexer(CharStreams.fromFileName(inputFileName, Charset.forName(CHARSET_TO_USE)));
    DSLParser parser = new DSLParser(new CommonTokenStream(lexer));
    ParserErrorStrategy pes = new ParserErrorStrategy();
    parser.setErrorHandler(pes);
    // Get root symbol parsed and check for syntax errors
    root = parser.root();
    int errors = pes.getErrorCount();
    if (errors != 0) {
      System.err.printf("%s: %d syntax errors%n", inputFileName, errors);
      System.exit(1);
    }
    // Check for semantic errors
    errors = new Checker().verify(root);
    if (errors != 0) {
      System.err.printf("%s: %d semantic errors%n", inputFileName, errors);
      System.exit(1);
    }
  }

  void generateDiagram() throws IOException {
    // Handle settings 
    boolean executeDot = ! Options.format.value.equals("none");
    File dotFile, outputFile;
    if (executeDot) {
      dotFile = File.createTempFile("erdg", ".dot");
      dotFile.deleteOnExit();
      outputFile = new File(outputFileName);
    }
    else {
      dotFile = outputFile = new File(outputFileName);
    }
    // Generate dot file for diagram
    if (infoMsgs) {
      System.err.printf("--> Generating Graphviz file onto %s%n", dotFile.getPath());
    }
    try (PrintStream out = new PrintStream(dotFile, CHARSET_TO_USE)) {
      DiagramGenerator dg = typeOfDiagram == DiagramType.sch ?
          new SchemaDiagramGenerator(out, typeOfDiagram) :
            new ERDiagramGenerator(out, typeOfDiagram);
          dg.visit(root);
    }
    // Execute dot 
    if (executeDot) {
      String[] dotCommandArgs = {
          "dot",
          "-T" + Options.format.value,
          "-o" + outputFile.getPath(),
          dotFile.getPath()
      };
      if (infoMsgs) {
        System.err.print("--> Executing Graphviz dot program: ");
        Arrays.asList(dotCommandArgs).forEach(x -> System.err.print(x + ' '));
        System.err.println('\'');
      }
      int exitCode = Shell.execute(dotCommandArgs);
      if (exitCode != 0) {
        System.err.printf("Dot execution ended in error???%n");
      } else if(infoMsgs) {
        System.err.printf("--> Output file: '%s'%n", outputFile.getPath());
      }
    }
  }
}
