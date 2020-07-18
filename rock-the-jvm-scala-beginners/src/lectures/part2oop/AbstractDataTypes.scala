package lectures.part2oop

import lectures.part2oop.Inheritance.Dog

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    val creatureType: String = "K9"

    def eat: Unit = {

      println("crunch crunch")
    }
  }
  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")

    def eat() = {
      "nomnom"
    }
  }

  val dog = new Dog()
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  // 1 - traits do not have constructor params
  // 2 - multiple traits can be inherited vs only 1 abstract class
  // 3 - traits = behavior, abstract class = type of thing




}
