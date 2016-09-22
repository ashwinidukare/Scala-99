import scala.collection.mutable.ListBuffer

/**
  * Created by ashvini on 6/9/16.
  */
class Palimdrome {

  def reverse(list:List[Int]):List[Int]={

    var lbuf=new ListBuffer[Int]
    var i=0
    for(i<-list.length-1 to (0,-1)){

      lbuf+=list(i)
    }
    //println(lbuf)
    lbuf.toList
  }
  def isPalim(list:List[Int]): Unit =
  {
    val list1=reverse(list)
    if(list1==list)
      {
        println("Palimdrome")
      }
    else
      {
        println("Not Palimdrome")
      }

  }
}
object Palimdrome
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,3,2,1)
    val list1=List[Int](1,2,3,4,3,2,1,8)
    val ob=new Palimdrome
    ob.isPalim(list)
    ob.isPalim(list1)
  }
}
