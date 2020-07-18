package lectures.part2oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahhahahhha")
  }
  /*
   equivalent with

   class AnonymousClasses extends Animal {
    override def eat: Unit = println("ahahhahahhha")
   }
   val funnyAnimal = new AnonymousClasses
   */

  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }


}
