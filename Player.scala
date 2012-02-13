package player

// companion obj
object Player {
  import scala.collection.mutable.Map
  
  val players = Map[String, Player]()

  // returns unit if no =
  def count { println(players.size) }
  
  def start(name: String) = {
    if (players contains name)
      players(name)
    else {
      val p = new Player(name)
      players += (name -> p)
      p
    }
  }
}

class Player(name: String, x:Int, y:Int) {

  // condition on init
  require(name != "")
  
  // second constructor
  def this(name: String) = this(name, 1, 1)
  
  // override example
  override def toString = name + " @ x: " + x + " y: " + y
}
