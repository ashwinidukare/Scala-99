import scala.collection.mutable.ListBuffer

/**
  * Created by ashvini on 6/9/16.
  */
class ReverseList {
  def reverse(list:List[Int]):List[Int]={

    var lbuf=new ListBuffer[Int]
    var i=0
    for(i<-list.length-1 to (0,-1)){

      lbuf+=list(i)
    }
    println(lbuf)
    lbuf.toList
  }

}
object ReverseList
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,5,6,7)
    val ob=new ReverseList
    val newList=ob.reverse(list)
    println(newList)
  }
}
