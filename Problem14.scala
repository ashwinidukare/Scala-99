/**
  * Created by ashvini on 6/9/16.
  */
class DuplElement {
  def repeat[Char](elem: Char, n: Int): List[Char] = n match {
    case 0 => Nil
    case _ => elem :: repeat(elem, n - 1)
  }

  def dupEle(lst: List[Char], n: Int): List[Char] = lst.flatMap(repeat(_, n))
}
object DuplElement
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a','b','c','c','d')
val ob=new DuplElement
    println(ob.dupEle(list,2))
  }
}
