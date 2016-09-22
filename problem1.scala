/**
  * Created by ashvini on 6/9/16.
  */
class LastElemOfList
{
def lastElem(list:List[Int]): Int =
  {
      if((list.tail).isEmpty)
        list.head
    else
        lastElem(list.tail)
  }
}
object LastElemOfList
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,5,6,7,8,9)
    val ob=new LastElemOfList
    val last=ob.lastElem(list)
    println(last)

  }
}
