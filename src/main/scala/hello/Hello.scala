package hello

// Scala does NOT have: static (use object instead of class)
// NOR does it have "public" (it's the default!)
// Scala uses [] for *generics* NOT arrays!!!
object Hello {
  def main(args: Array[String]): Unit = {
    //    println("Hello Scala World!"); println("Really, it's cool here")
    println("Hello Scala World!")
    println("Really, it's cool here")
  }
}
