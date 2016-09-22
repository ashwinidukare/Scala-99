/**
  * Created by ashvini on 20/9/16.
  */
class DropNthElem {
def drop(list:List[Symbol],n:Int):List[Symbol]=
{
  val x=list zip(Stream from 1)
  x.filterNot((_._2 % n==0)).map(_._1)
}
}
object DropNthElem
{
  def main(args: Array[String]): Unit = {
    val list=List[Symbol]('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

val ob=new DropNthElem
    println(ob.drop(list,3))
  }
}
