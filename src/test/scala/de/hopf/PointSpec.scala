package test.scala.de.hopf

import collection.mutable.Stack
import org.scalatest._
import main.scala.de.hopf.Point

class PointSpec extends FlatSpec {

  "A Point" should "have x and y" in {
    val point = new Point(1, 4)

    assert(point.x == 1)
    assert(point.y == 4)
  }

}