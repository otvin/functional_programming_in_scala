/**
  * Created by fred on 5/29/16.
  */
object ex23 {

  def curry[A,B,C] (f: (A,B) => C) : A => (B => C) = {
    (a : A) => ((b : B) => f(a, b))
  }

  def main(args: Array[String]) : Unit = {

    def add(a: Int, b: Int) : Int = a + b

    println(add(3,4))

    def q = curry(add)
    def add7 = q(7)

    println(add7(9))

    def add11 = curry(add)(11)
    println(add11(97))

  }
}
