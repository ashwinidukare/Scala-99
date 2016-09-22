/**
  * Created by ashvini on 6/9/16.
  */
class TotalNoOfElem {
def counter(list:List[Int]): Int =
  {
    var cnt=0
    for(i<-list)
      {
        cnt=cnt+1
      }
    cnt
  }
}
object TotalNoOfElem
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,5,6,7)
    val ob=new TotalNoOfElem
    val x=ob.counter(list)
    println(x)
  }
}
