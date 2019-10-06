package com.chapters04

object Boot extends App {

  // This will print the "This is strict" due to scala always treat field as a strict value
  val strictnessDemo = new StrictnessDemo

  // This will not print "This is lazy" until it was calling
  val lazinessDemo = new LazinessDemo
  lazinessDemo.lazyVal

  // Use ByName parameter to control laziness
  val byNameParameter = new ByNameParameter
  val res = byNameParameter.greet("Mikael", AppConfig.greeting)
  println(res)


  val lazyDataStructure = new LazyDataStructure
  // Strict processing
  //  filter 0
  //  filter 1
  //  filter 2
  //  map 0
  //  map 2
  //  map2 1
  //  map2 3
  //  Vector(2, 4)
  println(lazyDataStructure.evenPlusTwo(Vector(0, 1, 2)))

  // Laziness processing
  println(lazyDataStructure.evenLazinessPlusTwo(Vector(0, 1, 2)))
  println(lazyDataStructure.evenStreamPlusTwo(Stream(0, 1, 2)).toVector)

  // Stream collection usage
  val streamCollection: Stream[Int] = 0 #:: 2 #:: streamCollection.tail.map(_ + 2)
  println(streamCollection.take(10).toVector)
}
