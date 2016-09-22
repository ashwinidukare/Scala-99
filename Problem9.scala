import scala.collection.mutable.ListBuffer

/**
  * Created by ashvini on 6/9/16.
  */
class ConsecutiveDup {

  def packDemo[Char](lst: List[Char]): List[List[Char]] = lst match {
    case Nil => Nil
    case x :: xs => (List(x) ::: xs.takeWhile(_==x))::packDemo(xs.dropWhile(_ == x))
  }


}
object ConsecutiveDup
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'a', 'd', 'd', 'e', 'e', 'e')
    val ob=new ConsecutiveDup
    println(ob.packDemo(list))

  }
}
