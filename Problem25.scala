
/**
  * Created by ashvini on 21/9/16.
  */
class RamdomPermutaion {
  import scala.util.Random

  def takeSample(a: List[Symbol], n: Int): List[Symbol] = {
    n match {
      case n: Int if n <= 0 => List.empty
      case n: Int => a(Random.nextInt(a.size)) :: takeSample(a, n - 1)
    }
  }
}
object RamdomPermutaion
{
  def main(args: Array[String]): Unit = {
    val list=List[Symbol]('a, 'b, 'c, 'd, 'f, 'g, 'h)

    val ob=new RamdomPermutaion
    print(ob.takeSample(list,list.length))
  }
}
