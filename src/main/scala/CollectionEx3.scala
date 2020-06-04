import scala.collection.immutable.ListMap

object CollectionEx3 extends App {
  var listMap = ListMap("Rice"->"100","Wheat"->"50","Gram"->"500")    // Creating listmap with elements
  listMap.foreach{
    case(key,value)=>println(key+"->"+value)
  }
  println(listMap("Rice"))

  val updatedListMap =listMap - "Rice"
  println(listMap)
  println((updatedListMap))
}
