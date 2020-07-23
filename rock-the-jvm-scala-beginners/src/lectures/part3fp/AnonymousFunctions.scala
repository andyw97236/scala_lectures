package lectures.part3fp

object AnonymousFunctions extends App{

  // anonymous function (LAMBDA)
  val doubler = (x: Int) => x * 2

  // multiple params // _ refers to the parameters first instance first param etc
  val adder: (Int, Int) => Int = _ + _

  // no params
  val justDoSomething = () => 3

  // careful
  println(justDoSomething) //function itself
  print(justDoSomething()) // call

  // curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MORE syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) =>  Int = _ + _ // equivalent to (a,b) => a + b

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))

}
