package de.htwg.se.yourgame

import de.htwg.se.yourgame.model.{Player,Cell}

object YourGame {
  def main(args: Array[String]): Unit = {

    val player1 = Player("red")
    println("Hello, " + player1.name)



    val cell = Cell(1)
    //println(cell.toString)
    println(cell.isSet)

  }
}
