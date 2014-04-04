package scmstats

/**
 * @author hani
 *         Date: 4/3/14
 *         Time: 9:25 PM
 */
class CommentParser {
  val commentBeginnings = Map(
    "java" -> "/*",
    "scala" -> "/*",
    "sql" -> "/*",
    "c" -> "/*",
    "cc" -> "/*",
    "cpp" -> "/*",
    "h" -> "/*",
    "hh" -> "/*",
    "hpp" -> "/*",
    "php" -> "<!--",
    "html" -> "<!--",
    "xml" -> "<!--",
    "jspx" -> "<!--",
    "jsp" -> "<!--",
    "py" -> "\"\"\"",
    "glsl" -> "/*",
    "rb" -> "=begin",
    "js" -> "/*"
  )

  val commentEnd = Map(
    "java" -> "*/",
    "scala" -> "*/",
    "sql" -> "*/",
    "c" -> "*/",
    "cc" -> "*/",
    "cpp" -> "*/",
    "h" -> "*/",
    "hh" -> "*/",
    "hpp" -> "*/",
    "php" -> "-->",
    "html" -> "-->",
    "xml" -> "-->",
    "jspx" -> "-->",
    "jsp" -> "-->",
    "py" -> "\"\"\"",
    "glsl" -> "*/",
    "rb" -> "=end",
    "js" -> "*/"
  )

  val comment = Map(
    "java" -> "//",
    "scala" -> "//",
    "sql" -> "--",
    "c" -> "//",
    "cc" -> "//",
    "cpp" -> "//",
    "h" -> "//",
    "hh" -> "//",
    "hpp" -> "//",
    "php" -> "//",
    "py" -> "#",
    "glsl" -> "//",
    "rb" -> "=end",
    "js" -> "//"
  )

  def getComments(code: String) = {

  }
}
