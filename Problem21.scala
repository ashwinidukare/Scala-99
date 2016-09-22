/**
  * Created by ashvini on 21/9/16.
  */
class InsertAt {

  def insertAt(index: Int,list:List[Char],newEl:Char):List[Char] =
  {
    list.take(index) ++ List(newEl) ++ list.drop(index)
  }
}

object InsertAt
{
  def main(args: Array[String]): Unit = {
    val ob=new InsertAt
    val list=List[Char]('a', 'b', 'c', 'd')
    println(ob.insertAt(4,list,'p'))
  }
}
