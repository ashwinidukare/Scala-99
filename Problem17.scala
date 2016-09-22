/**
  * Created by ashvini on 20/9/16.
  */
class Split {

  def split(list:List[Symbol],n:Int):(List[Symbol],List[Symbol])=
  {
    val x=list zip(Stream from 1)
    val y=x.filter((_._2 < n+1)).map(_._1)
    val z=x.filterNot(_._2 < n+1).map(_._1)

    (y,z)
  }

}
object Split
{
  def main(args: Array[String]): Unit = {
    val list=List[Symbol]('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
val ob=new Split
    println(ob.split(list,3))
  }
}
