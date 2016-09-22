/**
  * Created by ashvini on 20/9/16.
  */
class Rotate {
  def rotate(list:List[Symbol],num:Int): List[Symbol] =
  {
    val reverseList=list.reverse

    val x=list zip(Stream from 1)

    if(num>0)
      {
        val lst1=x.takeWhile(y=>(num >= y._2)).map(_._1)
        val lst2= x.dropWhile(y=>(num >= y._2)).map(_._1)
        lst2 ::: lst1
      }
    else
    {
      val z= reverseList zip (Stream from 1)
      val p=z.takeWhile(y=>(Math.abs(num) >= y._2)).map(_._1).reverse
      val q=z.dropWhile(y=>(Math.abs(num) >= y._2)).map(_._1).reverse

      p ::: q
    }


  }

}
object Rotate
{
  def main(args: Array[String]): Unit = {
    val list=List[Symbol]('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val ob=new Rotate
    //val num= -3

        println(ob.rotate(list,-2))
    println(ob.rotate(list,3))

  }
}
