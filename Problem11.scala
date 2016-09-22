/**
  * Created by ashvini on 7/9/16.
  */
class ListModify {

  def packDemo[Char](lst: List[Char]): List[List[Char]] = lst match {
    case Nil => Nil
    case x :: xs => (List(x) ::: xs.takeWhile(_==x))::packDemo(xs.dropWhile(_ == x))
  }

  def encode[Char](xs: List[Char]): List[(Int, Char)] = packDemo(xs).map(x => (x.length, x.head))

  def modify[Char](xs: List[Char]) = encode(xs).map(_ match{
    case (1,x)=>x
    case (n,x)=>(n,x)

  })

}
object ListModify
{
  def main(args: Array[String]): Unit =
  {
    val list=List[Char]('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'd', 'd', 'e', 'e', 'e')
    val ob=new ListModify

println(ob.modify(list))

  }
}
