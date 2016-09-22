/**
  * Created by ashvini on 6/9/16.
  */
class RemoveDup {
  def demo(lst: List[Char]): List[Char] = lst match {
    case Nil => Nil
    case x :: xs => x :: demo(xs.dropWhile(_ == x))
  }
}
object RemoveDup
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

    val obj=new RemoveDup

    println(obj.demo(list))
  }

}
