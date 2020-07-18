package lectures.part2oop

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm

object Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("Static")
  object Person {
    // "static"/"class" level definitions
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person) = new Person("Bobbie")
  }
  class Person(val name: String = "") {
      // instance level functionality
  }
  //companions

  // scala app = scala object with def main(args: Array[String]): Unit definition or just extends app
  def main(args: Array[String]): Unit = {
    // access the singleton instance of Person
    println(Person.N_EYES)
    println(Person.canFly)

    // scala object
    val mary = new Person("mary")
    val john = new Person("john")
    println(mary == john) // false

    val bobbie = Person(mary, john)
    println(bobbie.name)
  }
}
