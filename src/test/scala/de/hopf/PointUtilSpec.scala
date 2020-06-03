package test.scala.de.hopf

import collection.mutable.Stack
import org.scalatest._
import main.scala.de.hopf.Point
import main.scala.de.hopf.PointUtil

class PointUtilSpec extends FlatSpec {

  var pA = new Point(1, 1)
  var pB = new Point(1, 3)
  var pC = new Point(4, 4)
  var pD = new Point(6, 1)

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

  "A PointUtil" should "determineDistance1" in {
    val distance =
      PointUtil.determineDistance(new Point(1, 4), new Point(2, 3))

    assert(distance == 1.4142135623730951)
  }

  "A PointUtil" should "determineDistance2" in {
    val distance =
      PointUtil.determineDistance(new Point(1, 1), new Point(3, 1))

    assert(distance == 2.0)
  }

  "A PointUtil" should "determineMaximumOfArray1" in {
    var points: Array[Point] = new Array[Point](3)
    points(0) = pA
    points(1) = pB
    points(2) = pC

    val pointUtil = PointUtil.determineMaximumOfArray(points)

    assert(pointUtil == 4.24)
  }

  "A PointUtil" should "determineMaximumOfArray2" in {
    var points: Array[Point] = new Array[Point](4)
    points(0) = pA
    points(1) = pB
    points(2) = pC
    points(3) = pD

    val pointUtil = PointUtil.determineMaximumOfArray(points)

    assert(pointUtil == 5.39)
  }

  "A PointUtil" should "determineMaximumOfArray3" in {
    var points: Array[Point] = new Array[Point](3)
    points(0) = pA
    points(1) = pC
    points(2) = pD

    val pointUtil = PointUtil.determineMaximumOfArray(points)

    assert(pointUtil == 5.0)
  }

  "A PointUtil" should "determineMinimumOfArray1" in {
    var points: Array[Point] = new Array[Point](3)
    points(0) = pA
    points(1) = pC
    points(2) = pD    

    val pointUtil = PointUtil.determineMinimumOfArray(points)

    assert(pointUtil == 3.61)
  }

  "A PointUtil" should "determineMinimumOfArray2" in {
    var points: Array[Point] = new Array[Point](4)
    points(0) = pA
    points(1) = pB
    points(2) = pC
    points(3) = pD    

    val pointUtil = PointUtil.determineMinimumOfArray(points)

    assert(pointUtil == 2.0)
  }
}
