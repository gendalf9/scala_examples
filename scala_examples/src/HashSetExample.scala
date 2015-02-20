/**
 * Created by gendalf9 on 15. 2. 20..
 */
import scala.collection.mutable.Map
object HashSetExample extends App{
  val treasureMap = Map[Int, String]()
  treasureMap += (1-> "Go to island.")
  treasureMap += (2-> "Find big X on ground")
  treasureMap += (3-> "Dig")
  println(treasureMap(2))
}
