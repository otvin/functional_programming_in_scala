import scala.annotation.tailrec
import scala.math.abs

object ex22 {

  def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
    @tailrec
    def loop(n: Int) : Boolean = {
      if (n >= (as.length - 1)) true
      else if (!ordered(as(n), as(n+1))) false
      else loop(n+1)
    }

    loop(0)
  }

  def main(args: Array[String]) : Unit = {
    println(isSorted(Array(1,2,3,4,5), (x : Int, y: Int) => x < y))
    println(isSorted(Array(1,3,2,4,5), (x : Int, y: Int) => x < y))
    println(isSorted(Array(1,-2,3,-4,5), (x: Int, y: Int) => x < y))
    println(isSorted(Array(1,-2,3,-4,5), (x: Int, y: Int) => abs(x) < abs(y)))
    println(isSorted(Array("alpha", "bravo", "charlie", "delta"), (x : String, y: String) => x < y))
  }

}