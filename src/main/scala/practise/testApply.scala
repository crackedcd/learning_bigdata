package main.scala.practise

object testApply {
  def main(args: Array[String]): Unit = {
    val unit = person()
    Array(1,3,5,7)
  }

  class person {
  }

  object person {
    def apply() = {
      println("hello hello")
    }
  }

}
