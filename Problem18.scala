/**
  * Created by ashvini on 20/9/16.
  */
class Slice {
def slice(list:List[Symbol],start:Int,end:Int): List[Symbol] =
  {
    val x=list zip(Stream from 1)
    val y=x.takeWhile(y=>(end >= y._2)).map(_._1)
    val m=y zip(Stream from 1)
      m.dropWhile(p=>(start>=p._2)).map(_._1)
  }
}
object Slice
{
  def main(args: Array[String]): Unit = {
    val list=List[Symbol]('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    val ob=new Slice
    println(ob.slice(list,3,7))
  }
}
