import scala.collection.immutable.Nil

/**
  * Created by ashvini on 20/9/16.
  */
class RemoveKth{

def remove(list:List[Char],n:Int):(List[Char],Char)
={
  val x=list.zipWithIndex
 val m=x.filterNot(y=>(y._2==n)).map(_._1)
// println()

  (m,nth(n,list))

}
  def nth(index: Int, aList: List[Char]) :Char= {
    if (index > aList.length - 1) '0'
    else aList(index)
  }
}
object RemoveKth
{
  def main(args: Array[String]): Unit = {
    val list=List[Char]('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val ob=new RemoveKth
    println(ob.remove(list,2))
  }
}
