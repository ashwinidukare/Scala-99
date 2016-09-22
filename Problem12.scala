/**
  * Created by ashvini on 22/9/16.
  */
class ListDecode {

  def packDemo[Char](lst: List[Char]): List[List[Char]] = lst match {
    case Nil => Nil
    case x :: xs => (List(x) ::: xs.takeWhile(_==x))::packDemo(xs.dropWhile(_ == x))
  }

  def encode[Char](xs: List[Char]): List[(Int, Char)] = packDemo(xs).map(x => (x.length, x.head))

  def modify[Char](xs: List[Char]) = encode(xs).map(_ match{
    case (1,x)=>x
    case (n,x)=>(n,x)

  })
  //Problem 12
  def repeat[Char](elem:Char,n:Int):List[Char]= n match
  {
    case 0=>Nil
    case _=>elem :: repeat(elem,n-1)
  }
  def decode[Char](lst:List[(Int,Char)]):List[Char]=lst.flatMap(x=>repeat(x._2,x._1))
}
object ListDecode
{
  def main(args: Array[String]): Unit =
  {
    val list=List[Char]('a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'd', 'd', 'e', 'e', 'e')
    val ob=new ListDecode

    val newList=ob.encode(list)
    println(ob.decode(newList))
  }
}