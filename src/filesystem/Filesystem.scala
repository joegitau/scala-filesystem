package filesystem

import commands.Command
import files.Directory

import java.util.Scanner

object Filesystem extends App {
  val scanner = new Scanner(System.in)

  val root = Directory.ROOT
  var state = State(root, root)

  while (true) {
    state.show()

    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }
}
