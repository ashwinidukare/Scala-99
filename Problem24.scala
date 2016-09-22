/**
  * Created by ashvini on 21/9/16.
  */
class DrawRandom {
val r=new util.Random
  import scala.util.Random

  def takeSample(count:Int,maxLimit:Int): List[Any] =count match {

    case count: Int if count <= 0 => List.empty
    case _: Int => List(Random.nextInt(maxLimit))++ takeSample(count-1, maxLimit)

  }
}
object DrawRandom
{
  def main(args: Array[String]): Unit = {


val ob=new DrawRandom
    println(ob.takeSample(6,49))

  }
}

