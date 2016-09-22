/**
  * Created by ashvini on 6/9/16.
  */
class KthElement {
  def kthElem(list:List[Int],k:Int): Unit =
  {
    if(k<list.length)
      println(list(k))
    else
      Nil
  }

}
object KthElement
{
  def main(args: Array[String]): Unit = {
    val list=List[Int](1,2,3,4,5,6,7,8,9)
    val ob=new KthElement
    ob.kthElem(list,2)
  }
}
