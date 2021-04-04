package files

class Directory(val parentPath: String,  val name: String, contents: List[DirEntry])
                extends DirEntry(parentPath, name) {

}

object Directory {
  val SEPARATOR = "/"
  val ROOT_PATH = "/"

  def ROOT: Directory = empty("", "")

  def empty(parentPath: String, name: String) =
    new Directory(parentPath, name, List())
}
