import scala.collection.mutable.ArrayBuffer

@main def run(): Unit =
  val numbers = ArrayBuffer(1, 2, 3)

  // Add an element
  numbers += 4
  println(numbers)

  // Add multiple elements
  numbers ++= Seq(5, 6)
  println(numbers)

  // Remove an element
  numbers -= 2
  println(numbers)

  // Remove by index
  numbers.remove(0)
  println(numbers)