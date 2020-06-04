import scala.collection.immutable.HashMap


object CollectionEx2 extends App{
  val hashMap = HashMap( ("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
 println(hashMap.toList)

  hashMap.foreach {
    case (key, value) => println (key + " -> " + value)
  }

  val updatedHashMap = hashMap - "PD"
  println(hashMap)
  println(updatedHashMap)
}
