package dbdia;

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
