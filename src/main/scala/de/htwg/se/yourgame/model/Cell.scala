package de.htwg.se.yourgame.model

case class Cell(value: Int) {

  def isSet: Boolean = value != 0
  override def toString: String = "value: " + value + " "


}
