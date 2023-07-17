package hello

// Scala does NOT have: static (use object instead of class)
// NOR does it have "public" (it's the default!)
// Scala uses [] for *generics* NOT arrays!!!
object Hello {
  var counter = 10

  def plusCounter(a: Int): Int = counter + a

  // RHS of a function declaration is simply an EXPRESSION
  //  def add(a:Int, b: Int):Int = {a + b}

  // curlies here are still an EXPRESSION
  def add(a: Int, b: Int): Int = {
    //    counter++ // don't have ++ etc!
    //    counter += 1 // BAD!!! "observable side effect"

    // printing is technically a "side effect" but not really "observable"
    println(s"adding ${a} and $b to produce ${a + b}")

    //    return a + b // allowed but ODD and unnecessary
    a + b
  }

  //  def describe(a: Int, b: Int): String = {
  //    if (a > b) {
  //      return "a is greater than b"
  //    } else {
  //      return "b is greater than a"
  //    }
  //  }

  def describe(a: Int, b: Int): String =
    if (a > b) "a is greater than b"
    else "b is greater than a"

  def getUnit: Unit = {
    println("Getting unit...")
    ()
  }
  //  val getUnit = ()

  //  def showMany(xs:String*):Unit = {
  def showMany(xs: Any*): Unit = {
    println(xs)
    for {
      v <- xs
    } println(s"value of v is ${v}")
  }

  def main(args: Array[String]): Unit = {
    //    println("Hello Scala World!"); println("Really, it's cool here")
    println("Hello Scala World!")
    println("Really, it's cool here")

    println(s"Sum of 2 and 3 is ${add(3, 4)}")

    val sum = {
      println("evaluating sum...")
      val intermediate = 44 + 55
      intermediate + 102 // value of a "curly-expression"
      // or "compound expression" is the LAST expression in the curlies
    }
    println("About to do stuff...")
    println(s"Sum is ${sum}")
    println(describe(99, 100))
    println(getUnit)
    println(getUnit.getClass.getName)

    showMany("A", "B")

    val names = Array("Fred", "Jim", "Sheila")
    showMany(names: _*)

    // Any -  any type including "primitives"
    // AnyRef - equivalent to java.lang.Object
    // val is "final" in Java
    //    val n1:AnyRef = "Hello"
    val n1: String = "Hello"
    //    n1 = "Bonjour"
    val n3 = "He" // type inferred to be String
    val n2 = n3 + "llo"
    println(n1)
    println(n2)
    // translate == into "content equivalent" (also != not-equal)
    println(n1 == n2)

    // identity comparison
    println(n1.eq(n2))

    var count = 99
    //    count = "ninetyseven" // NOPE, strong static type!

    count -= 1
    println(count)

    count = 3
    while (count != 0) {
      println(s"count is ${count}")
      count -= 1
    }

    println(s"first name element is ${names(0)}")
    names(0) = "Frederick"
    println(s"first name element is now ${names(0)}")

    val t = (99, "Fred", 3.141)
    println(t)
    println(t.getClass.getName)
    // scala 2 tuple element access is ugly
    println(t._1) // NOTE, indexes are ONE based
    // tuples are immutable
    //    t._1 = 100 // NOT allowed

    val (x1, x2, x3) = t
    println(s"x1 is ${x1}..")

  }
}
