package scmstats

/**
 * @author hani
 *         Date: 4/3/14
 *         Time: 9:11 PM
 */
class CommentSpec extends UnitSpec {
  val parser = new CommentParser

  it should "detect start of comment as a comment block" in {
    parser.isComment("scala", " //hi") shouldBe true
  }
  
  it should "not flag code as a comment" in {
    parser.isComment("java", "class Foo") shouldBe false
  }
  
  it should "detect a multi line comment" in {
    parser.isComment("c",
      """
        /*
        hi!
        */
      """) shouldBe true
  }
}