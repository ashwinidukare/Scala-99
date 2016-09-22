/**
  * Created by ashvini on 20/9/16.
  */
class DuplicateNTimes {
  def repeat[Char](elem: Char, n: Int): List[Char] = n match {
    case 0 => Nil
    case _ => elem :: repeat(elem, n - 1)
  }

  def dupEle(lst: List[Char], n: Int): List[Char] = lst.flatMap(repeat(_, n))

}
object DuplicateNTimes
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a','b','c','c','d')
    val ob=new DuplElement
    println(ob.dupEle(list,5))
  }
}
