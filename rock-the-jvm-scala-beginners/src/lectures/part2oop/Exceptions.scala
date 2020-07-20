package lectures.part2oop

object Exceptions extends App {
   val x: String = null

  // println(x.length)
  //Throws NPE

  //1.  throwing and catching exceptions
  //val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exceptions and Error are major Throwable subtypes

  // 2. catching exceptions

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for yuo:")
    else 42

  val potentialFail = try{
    getInt(false)
  } catch {
    case e: RuntimeException => 43
  } finally {
    //optional
    // does not influence the return type of this expression
    println("finally")
  }

  println(potentialFail)

  // 3.  how to define your own
  class MyException extends Exception
  val exception = new MyException

  //throw exception

  // OOM val array = Array.ofDim(Int.MaxValue)
  //throw new OutOfMemoryError()

  //def infinite: Int = 1 + infinite
  //val noLimit = infinite
  //throw new StackOverflowError()

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalulationException extends RuntimeException("Divide by 0")

  object PocketCalc {
    def add(x: Int, y: Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }


    def subtract(x: Int, y: Int): Int ={
      val result = x - y
      if (x > 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int): Int ={
      if (y == 0) throw new MathCalulationException
      else x / y
    }

  }

  try{
    //println(PocketCalc.add(Int.MaxValue, 10))
    println(PocketCalc.divide(2,0))
  }catch{
    case e: OverflowException => println("exceeded max value")
    case e: UnderflowException => println("exceeded min value")
    case e: MathCalulationException => println("divide by zero")
  }



}
