package lectures.part1basics

object ValuesVariblesTypes extends App {

  val x: Int = 42

  println(x)

  // VALS ARE IMMUTABLE

  val aString: String = "hello"
  val anotherString = "goodbye"

  val asBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 65465464669999L
  val aFloat: Float = 2.0f
  val aDouble: Double = 1.23344

  //variables
  var aVariable: Int = 4

  aVariable = 5  // side effects

}
