/**
  * Created by ashvini on 20/9/16.
  */
class DirectEncode {
  def packDemo[Char](lst: List[Char]): List[List[Char]] = lst match {
    case Nil => Nil
    case x :: xs => (List(x) ::: xs.takeWhile(_==x))::packDemo(xs.dropWhile(_ == x))
  }
  def encode[Char](xs: List[Char]): List[(Int, Char)] = packDemo(xs).map(x => (x.length, x.head))

}

object DirectEncode
{
  def main(args: Array[String]): Unit =
  {
    val list=List[Char]('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'd', 'd', 'e', 'e', 'e')
    val ob=new DirectEncode
    println(ob.encode(list))


  }
}
