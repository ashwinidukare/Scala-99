/**
  * Created by ashvini on 6/9/16.
  */
class ListEncode {
  def packDemo[Char](lst: List[Char]): List[List[Char]] = lst match {
    case Nil => Nil
    case x :: xs => (List(x) ::: xs.takeWhile(_==x))::packDemo(xs.dropWhile(_ == x))
  }
  def encode[Char](xs: List[Char]): List[(Int, Char)] = packDemo(xs).map(x => (x.length, x.head))


}
object ListEncode
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'a', 'd', 'd', 'e', 'e', 'e')
    val ob=new ListEncode

    println(ob.encode(list))
  }
}
