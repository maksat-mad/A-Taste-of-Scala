import scala.collection.mutable.ArrayBuffer

@main def run(): Unit =
  trait Animal:
    val name: String
  case class Cat(name: String) extends Animal:
    def meow: String = "Meow"
  case class Dog(name: String) extends Animal:
    def bark: String = "Bark"

  def speak(animal: Animal) = animal match
    case c @ Cat(name) if name == "Felix" => println(s"$name says, ${c.meow}!")
    case d @ Dog(name) if name == "Rex" => println(s"$name says, ${d.bark}!")
    case _ => println("I don't know you!")

  speak(Cat("Felix")) // "Felix says, Meow!"
  speak(Dog("Rex"))   // "Rex says, Bark!"