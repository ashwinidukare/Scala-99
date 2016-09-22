/**
  * Created by ashvini on 6/9/16.
  */
class SecondLast {
  def lastElem(list:List[Int]): Int =
  {
    if((list.tail).length==1)
      list.head
    else
      lastElem(list.tail)
  }

}
object SecondLast
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,5,6,7,8,9)
    val ob=new SecondLast
    val secondLast=ob.lastElem(list)
    println(secondLast)

  }

}
