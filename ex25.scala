/**
  * Created by fred on 5/31/16.
  */
object ex25 {
  def compose[A, B, C] (f : B=>C, g : A=>B) : A => C = {
    (a : A) => f(g(a))
  }

  def main(args: Array[String]) : Unit = {
    def add7(a: Int) : Int  = a + 7
    def mult9(a: Int) : Int = a * 9

    val q = compose(add7, mult9)
    println(q(4))
  }

}
