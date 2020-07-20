package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    // use the type A and accept any subclasses of type A and call it B
    def add[B >: A](element: B) : MyList[B] = ???
    /*
    A = Cat
    B = Dog
     */
  }

  class MyMap[Key, Value]

  val listOfInts = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1.  yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // animalList.add(new Dog) ??? Hard Question = we return a list of animals
  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val Trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types Cage only accepts types that are a subtype of animal
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  //
}
