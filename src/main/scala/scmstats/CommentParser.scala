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

  private def hasCommentEnd(ext: String, code: String) = {
    commentEnd.get(ext).exists(code.trim.endsWith)
  }
  
  private def hasCommentBeginning(ext: String, code: String) = {
    commentBeginnings.get(ext).exists(code.trim.startsWith)
  }
  
  def isComment(ext: String, code: String) = {
    if(commentBeginnings.get(ext).exists(code.trim.startsWith)) true
    else if(commentEnd.get(ext).exists(code.trim.endsWith)) true
    else if(comment.get(ext).exists(code.trim.startsWith)) true
    else false
  }  
}
