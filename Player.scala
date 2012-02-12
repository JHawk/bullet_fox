package player

class Player(name: String, x:Int, y:Int) {
  require(name != "")
  override def toString = name + " @ x: " + x + " y: " + y 
}
