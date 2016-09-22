import scala.collection.mutable.ListBuffer

/**
  * Created by ashvini on 6/9/16.
  */
class FlattenDemo {
  def flatten(xs: List[Any]): List[Any] = xs.flatMap(x => x match {
    case ls: List[Any] => flatten(ls)
    case n => n :: Nil
  })

}
object FlattenDemo
{
  def main(args: Array[String]): Unit = {

    val k = List(1, List(2, 3),List(List(List(4,78,56))), List(5), List(6, 7), 8)

   // println(k)
  val ob=new FlattenDemo
    val lst=ob.flatten(k)
    println(lst)

  }
}
