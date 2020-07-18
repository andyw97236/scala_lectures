package lectures.part2oop
import scala.language.postfixOps

object MethodNotations extends App{
  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie: String) = movie == favoriteMovie
    def +(title: String) = new Person(s"$name ($title)", favoriteMovie)
    def unary_+ = new Person(name, favoriteMovie, age + 1)
    def unary_! = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def learns(course: String) = s"$name learns $course"
    def learnsScala = learns("Scala")

    // apply() is the method called when you call the object as a function ie instance()
    def apply(n: Int) = s"$name watched $favoriteMovie $n times"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))

  // infix notation = operator notation (syntactic sugars) only works on methods with 1 param
  println(mary likes "Inception")


  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_-

  // unary_ prefix only works with - + ~ !
  println(!mary)
  println((+mary).age)


  val maryWithTitle = mary + "the rockstar"
  println(maryWithTitle.name)

  // postfix notation methods with no params
  println(mary learnsScala)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply(2))
  println(mary(2))






}
