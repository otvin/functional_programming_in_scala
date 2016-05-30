import scala.annotation.tailrec

/**
  * Created by fred on 5/27/16.
  */
object ex21 {

  def fib(n: Int) : Int = {
    @tailrec
    def go(a: Int, b: Int, n: Int) : Int = {
      if (n <= 0) a
      else go(b, a+b, n-1)
    }
    go (0, 1, n)
  }

  private def formatFib(n: Int) = {
    val msg = "Fibonacci sequence #%d is %d."
    msg.format(n, fib(n))
  }

  def main(args: Array[String]) : Unit = {
    println(formatFib(0))
    println(formatFib(1))
    println(formatFib(2))
    println(formatFib(3))
    println(formatFib(4))
    println(formatFib(5))
    println(formatFib(6))
  }
}
