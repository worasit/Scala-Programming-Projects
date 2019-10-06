package com.chapters04

class LazyDataStructure {
  def evenPlusTwo(xs: Vector[Int]): Vector[Int] = {
    xs.filter { x => println(s"filter $x"); x % 2 == 0 }
      .map { x => println(s"map $x"); x + 1 }
      .map { x => println(s"map2 $x"); x + 1 }
  }

  /**
   * withFilter will manipulate the xs as a laziness
   *
   * @param xs
   * @return
   */
  def evenLazinessPlusTwo(xs: Vector[Int]): Vector[Int] = {
    xs.withFilter { x => println(s"filter $x"); x % 2 == 0 }
      .map { x => println(s"map $x"); x + 1 }
      .map { x => println(s"map2 $x"); x + 1 }
  }

  /**
   * Stream will provide the laziness collection, which will produce the same result with the "evenLazinessPlusTwo"
   *
   * @param xs
   * @return
   */
  def evenStreamPlusTwo(xs: Stream[Int]): Stream[Int] = {
    xs.filter { x => println(s"filter $x"); x % 2 == 0 }
      .map { x => println(s"map $x"); x + 1 }
      .map { x => println(s"map2 $x"); x + 1 }
  }
}
