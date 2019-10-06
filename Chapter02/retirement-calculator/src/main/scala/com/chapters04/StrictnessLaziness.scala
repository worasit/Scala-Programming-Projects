package com.chapters04

class StrictnessDemo {
  val strictVal = {
    println("This is strict")
    "Hello Strict"
  }
}

class LazinessDemo {
  lazy val lazyVal = {
    println("This is lazy")
    "Hello Lazy"
  }
}