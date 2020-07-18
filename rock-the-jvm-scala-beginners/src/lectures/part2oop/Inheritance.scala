package lectures.part2oop

object Inheritance extends App {

  class Animal {
    def eat = println("nomnom")
    val creatureType = "Wild"
  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat

  cat.crunch

  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String) extends Animal{
    override def eat= {
      super.eat //super
      println("crunch crunch")
    }
  }
  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat
  println(unknownAnimal.creatureType)

  //super

  // preventing overrides
  // 1 - use final on member
  // 2 = use final on class
  // 3 = sealed the class - extend the class in this file but not in other files.


}
