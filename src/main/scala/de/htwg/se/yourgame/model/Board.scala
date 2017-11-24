package de.htwg.se.yourgame.model

case class Board(size: Int) {

  def setBoard(): Unit = {
    var array: Array[Cell] = new Array[Cell](size)
    var a = 0
    for (a <- 0 to (size - 1)) {
      array(a) = Cell(0)
      print(array(a))
    }
    println(" ")
  }

}
