import player.Player

object Main {
  def main(args: Array[String]) {
    for (arg <- args)
      println(new Player(arg,1,1))
  }
}
