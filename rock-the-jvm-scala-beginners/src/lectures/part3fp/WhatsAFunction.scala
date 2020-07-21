package lectures.part3fp

object WhatsAFunction extends App {
  // use functions as first class elements
  // problem:

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function types = Function1[A, B]
  val stringToIntConverer = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverer("3") + 4)

  // function types Function2[A, B, R] === (A, B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS

  val stringConcat: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + b
  }

  println (stringConcat("a", " c"))

  def sqInt = (a: Int) => {
    a * a
  }

  def myFunc = (a: Int) =>  sqInt(a)

  println(myFunc(4))


}

trait MyFunction[A, B] {
  def apply(element: A):B
}

