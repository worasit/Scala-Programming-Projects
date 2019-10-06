package com.chapters04

object AppConfig {
  lazy val greeting: String = {
    println("Loading greeting")
    "Hello"
  }
}

class ByNameParameter {
  def greet(name: String, greeting: => String): String = {
    if (name == "Mikael") {
      greeting + name
    } else {
      s"$name, I don't know you"
    }
  }
}