package applystuff

object ApplyStuff {

  def update(x: String, y: Int): Unit =
    println(s"update called x is ${x}, y is ${y}")

  def apply(x: String, y:Int):Unit =
    println(s"apply called with ${x} and ${y}")

  def main(args: Array[String]): Unit = {
//    val names = Array[String]("Fred", "Jim", "Sheila")
//    val names = Array("Fred", "Jim", "Sheila")
    val names = Array.apply("Fred", "Jim", "Sheila")
    println(names(0))
    println(names.apply(0)) // objectid dot methodname parens...

    ApplyStuff.apply("Weird", 99)
    ApplyStuff("Weird", 99)

//    val names2 = Array.apply("Fred", "Alice", "Bob")
    val names2 = Array("Fred", "Alice", "Bob")

    println(s"type of Array is ${Array.getClass.getName}")
    println(s"type of names is ${names.getClass.getName}")

    println(s"names2(0) is ${names2(0)}")
//    names2(0) = "Frederick"
    names2.update(0, "Frank")
    println(s"names2(0) is ${names2(0)}")

    ApplyStuff.update("Alfie", 99)
    ApplyStuff("Alfie") = 99
  }
}
