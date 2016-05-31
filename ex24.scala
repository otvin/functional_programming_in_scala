/**
  * Created by fred on 5/30/16.
  */
object ex24 {

  // curry function is copied from ex2.3
  def curry[A,B,C] (f: (A,B) => C) : A => (B => C) = {
    (a : A) => ((b : B) => f(a, b))
  }


  def uncurry[A,B,C] (f: A => (B => C)) : (A,B) => C = {
    (a : A, b : B) => f(a)(b)
  }



  def main(args: Array[String]) : Unit = {

    def add(a: Int, b: Int) : Int = a + b

    println(add(3,4))

    def q = curry(add)
    def r = uncurry(q)

    println(r(77,22))


  }
}
