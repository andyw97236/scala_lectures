package lectures.part2oop

import org.w3c.dom.css.Counter

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  println(person.greet("Daniel"))
  println(person.greet())

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  var novel = new novel("Great Expecations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(3).print

}

// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2

  println(1 + 3)

  def greet(name: String) = println(s"${this.name} says: Hi, $name")

  def greet() = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
 novel and writer class

 Writer: first name, surname, year
   - method fullname

 novel: name, year of release, author(writer)
  - authorAge
  - isWrittenBy(author)
  - copy(new year of release) = new instance of novel

 */

class Writer(val fname: String, val lname: String, val birthyear: Int){
  def fullname: String = s"$fname $lname"
}

class novel(bname: String, releaseyear: Int, author: Writer){
  def authorAge = releaseyear - author.birthyear
  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYearOfRelease: Int) = new novel(bname, newYearOfRelease, author)
}

class Counter(val startcount: Int = 0){
  def count = startcount

  def inc = {
    println("incrementing")
    new Counter(startcount + 1)
  } // immutability
  def dec = {
    println("decrementing")
    new Counter(startcount - 1)
  } // immutability

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}



//class params are not fields
