package dbdia;

//
//Copyright Eduardo R. B. Marques
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//
/**
 * The dbdia program options.
 */
public enum Options {
  info("yes","Output progress message","[yes|_]"),
  format("", "Output format (use 'none' for obtaining graph file in dot format) - https://graphviz.org/doc/info/output.html", "[png|pdf|svg|none|...]"),
  layout("dot", "Graphviz layout - https://graphviz.org/doc/info/attrs.html#d:layout", "[dot|neato|twopi|fdp|...]"),
  clusterrank("global", "'clusterrank' configuration - https://graphviz.org/doc/info/attrs.html#d:clusterrank", "[local|global|none]"),
  color("black", "Line/border color - https://graphviz.org/doc/info/attrs.html#d:color", "<color>"),
  fillcolor("white", "Node fill color - https://graphviz.org/doc/info/attrs.html#d:fillcolor", "<color>"),
  fontcolor("black", "Font color - https://graphviz.org/doc/info/attrs.html#d:fontcolor", "<color>"),
  fontname("Courier", "Font name - https://graphviz.org/doc/info/attrs.html#d:fontname", "<name>"),
  fontsize("10", "Font size - https://graphviz.org/doc/info/attrs.html#d:fontsize", "<size>"),
  rankdir("LR", "'rankdir' configuration - https://graphviz.org/doc/info/attrs.html#d:rankdir", "[LR|TB|RL|BT|...]"),
  splines("spline", "'splines' configuration - https://graphviz.org/doc/info/attrs.html#d:splines", "[spline|line|polyline|ortho|curved|...]"),
  style("filled", "'style' configuration - https://graphviz.org/doc/info/attrs.html#d:style", "[filled|<undefined>]");

  String value;
  final String description;
  final String paramDesc;

  Options(String dv, String d, String p) {
    value = dv;
    description = d;
    paramDesc = p;
  }
}
