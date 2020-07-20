package lectures.part2oop

object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("jan", "hello", 2018)
  println(writer.fullname)

  // import the package  or use fully qualified name

  // packages are in hierarchy
  // matching folder structure

  // package object - good place for package constants

}
