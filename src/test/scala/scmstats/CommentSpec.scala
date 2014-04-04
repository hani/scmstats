package scmstats

import scala.io.Source

/**
 * @author hani
 *         Date: 4/3/14
 *         Time: 9:11 PM
 */
class CommentSpec extends UnitSpec {
  "A comment parser" should "detect javadoc style comments in Java files" in {
    val lines = Source.fromURI(getClass.getResource("/javadoc_header.java").toURI).mkString
    new CommentParser().getComments(lines) shouldEqual 1
  }
}