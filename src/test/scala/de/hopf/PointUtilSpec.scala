package test.scala.de.hopf

import collection.mutable.Stack
import org.scalatest._
import main.scala.de.hopf.Point
import main.scala.de.hopf.PointUtil

class PointUtilSpec extends FlatSpec {

  "A PointUtil" should "parseAllCoords" in {
    var coords: Array[String] = Array("(4,3)", "(5,2)", "(1,1)", "(1,2)")

    var res: Array[Point] = PointUtil.parseAllCoords(coords)

    assert(4 == res.length)
    assert(4 == res(0).x)
    assert(3 == res(0).y)
    assert(5 == res(1).x)
    assert(2 == res(1).y)
    assert(1 == res(2).x)
    assert(1 == res(2).y)
    assert(1 == res(3).x)
    assert(2 == res(3).y)
  }

  "A PointUtil" should "parseToCoord" in {
    var coords = "(4, 3)"

    var res: Array[Integer] = PointUtil.parseToCoord(coords)

    assert(2 == res.length)
    assert(4 == res(0))
    assert(3 == res(1))
  }

  "A PointUtil" should "parseToCoord1" in {
    var coords = "(4 3)"

    var res = PointUtil.parseToCoord(coords)

    assert(2 == res.length)
    assert(4 == res(0))
    assert(3 == res(1))
  }

  "A PointUtil" should "determineMinimum" in {
    val pointUtil = PointUtil.determineMinimum(new Point(1, 4), new Point(2, 3))

    assert(pointUtil == 1.4142135623730951)
  }

  "A PointUtil" should "determineMinimumOfArray1" in {
    var points: Array[Point] = new Array[Point](3)
    points(0) = new Point(1, 1)
    points(1) = new Point(4, 4)
    points(2) = new Point(6, 1)

    val pointUtil = PointUtil.determineMinimumOfArray(points)

    assert(pointUtil == 3.605551275463989)
  }

  "A PointUtil" should "determineMinimumOfArray2" in {
    var points: Array[Point] = new Array[Point](4)
    points(0) = new Point(1, 1)
    points(1) = new Point(1, 3)
    points(2) = new Point(4, 4)
    points(3) = new Point(6, 1)

    val pointUtil = PointUtil.determineMinimumOfArray(points)

    assert(pointUtil == 2.0)
  }

}