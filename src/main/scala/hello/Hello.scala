package hello

// Scala does NOT have: static (use object instead of class)
// NOR does it have "public" (it's the default!)
// Scala uses [] for *generics* NOT arrays!!!
object Hello {
  var counter = 10

  def plusCounter(a: Int):Int = counter + a

  // RHS of a function declaration is simply an EXPRESSION
//  def add(a:Int, b: Int):Int = {a + b}

  // curlies here are still an EXPRESSION
  def add(a:Int, b: Int):Int = {
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
  }
}
