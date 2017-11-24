package de.htwg.se.yourgame.model

case class Player(name: String) {

  override def toString:String = name

  def house(): Unit = {
    var array: Array[Cell] = new Array[Cell](4)
    var a = 0
    for (a <- 0 to 3) {
      array(a) = Cell(1)
      print(array(a))
    }
    println(" ")
  }

  def goal(): Unit = {
    var array: Array[Cell] = new Array[Cell](4)
    var a = 0
    for (a <- 0 to 3) {
      array(a) = Cell(0)
      print(array(a))
    }
    println(" ")
  }
}

