package de.htwg.se.yourgame

import de.htwg.se.yourgame.model.{Player,Cell}

object YourGame {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
    val cell = Cell(1)
    println(cell.toString)
    println(cell.isSet)

  }
}
