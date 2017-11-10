package de.htwg.se.menschaergerdichnicht

import de.htwg.se.menschaergerdichnicht.model.Player

object menschaergerdichtnicht {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
  }
}
