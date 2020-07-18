package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {

  def aFactorialFunction(n: Int): Int = {

    if (n <= 0) 1
    else n * aFactorialFunction(n-1)
  }

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)  // TAIL RECURSION = use recursive call as the last expression
    }

    factorialHelper(n, 1)
  }

  println(anotherFactorial(5000))


  // when you need loops use tail recursion

    def concatenateTailRec(aString: String, n: Int, accumulator: String = ""): String = {
        if (n <= 0 ) accumulator
        else concatenateTailRec(aString, n - 1, aString + " " + accumulator)
    }

    println(concatenateTailRec("hello", 2))



  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, true)
  }


  println("isPrime 11:" + isPrime(11))

  def fibonacci(n: Int): Int = {
    @tailrec
    def aFibonacciHelper(i: Int, last: Int, nextlast: Int = 1): Int = {
      if (i >= n) last
      else aFibonacciHelper(i + 1, last + nextlast, last)
    }
    if (n <= 2) 1
    else aFibonacciHelper(2, 1, 1)
  }

  println(fibonacci(8))

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(8))

}
