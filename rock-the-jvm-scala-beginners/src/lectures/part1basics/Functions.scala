package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  def aSimpleGreeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(aSimpleGreeting("David", 12))

  def aFactorialFunction(n: Int): Int = {
      if (n <= 0) 1
      else n * aFactorialFunction(n-1)
  }

  println(aFactorialFunction(5))

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(8))

  def isPrimeFunction(n: Int, i: Int = 2): Boolean = {
      if (n <= 1) false
      else if (n == 2)  true
      else if (n % i == 0)  false
      else if (i * i > n)  true
      else isPrimeFunction(n, i + 1)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println("isPrime 8:" + isPrimeFunction(8))
  println("isPrime 9:" + isPrimeFunction(9))
  println("isPrime 11:" + isPrimeFunction(11))

  println("isPrime 8:" + isPrime(8))
  println("isPrime 9:" + isPrime(9))
  println("isPrime 11:" + isPrime(11))

}
