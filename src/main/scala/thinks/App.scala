package thinks

import org.scalajs.dom
import org.scalajs.dom.document

object App {

  def appendHeader(): Unit = {
    val h1Node = document.createElement("h1")
    h1Node.textContent = "Thinks"
    val bodyNode = document.querySelector("body");
    bodyNode.appendChild(h1Node)
  }

  def setupUi(): Unit = {
    appendHeader()
  }

  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUi()
    })
  }

}