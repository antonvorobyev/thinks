package thinks

import utest._

import scala.scalajs.js

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._

object AppTest extends TestSuite {

  App.setupUi()

  def tests = Tests {

    test("Header") {
      assert(document.querySelectorAll("h1").count(_.textContent == "Thinks") == 1)
    }

  }

}
