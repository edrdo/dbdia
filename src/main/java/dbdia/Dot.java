package dbdia;

/**
 * Miscellaneous constants and utilities related to dot.
 */
public interface Dot {
  
  String DOUBLE_OUTLINE = "peripheries=\"2\"";
  
  String ER_ATTRIBUTE_SHAPE = "ellipse";

  String TOTAL_PARTICIPATION = "color=\"black:invis:black\"";
  
  /**
   * Shapes.
   */
  enum Shape {
    ATTRIBUTE("ellipse"),
    ENTITY("box"),
    RELATION("diamond"), 
    TABLE("plaintext");
    
    final String dotShape;
    
    Shape(String dotShape) {
      this.dotShape = dotShape;
    }
    
    @Override
    public String toString() {
      return String.format("shape=\"%s\"", dotShape);
    } 
  }

  static boolean isDotInstalled() {
    return Shell.execute("dot -V") == 0;
  }
}
