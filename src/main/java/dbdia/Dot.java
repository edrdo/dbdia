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
