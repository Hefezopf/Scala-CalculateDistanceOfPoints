package main.scala.de.hopf

import scala.math.sqrt;
import scala.math.pow;
import scala.util.matching.Regex
import scala.collection._

// object in Scala is like defining a class in Java that has only static methods
object PointUtil {

  def parseAllCoords(allCoords: Array[String]): Array[Point] = {
    var points = new Array[Point](allCoords.length)

    for (i <- 0 to allCoords.length - 1) {
      var xy: Array[Integer] = parseToCoord(allCoords(i))
      var p = new Point(xy(0), xy(1))
      points(i) = p
    }

    return points
  }

  def parseToCoord(coord: String): Array[Integer] = {
    var res = new Array[Integer](2)

    val pattern = new Regex("\\d")
    var xy = (pattern findAllIn coord).mkString(",")
    res(0) = xy(0) - 48
    res(1) = xy(2) - 48

    return res
  }

  def determineDistance(p1: Point, p2: Point): Double = {
    sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2))
  }

  def determineMaximumOfArray(points: Array[Point]): Double = {
    var max = Double.MinValue

    if (points.length == 0) {
      "too less points"
    }

    for (i <- 0 to points.length - 1) {
      max = calculateMaximum(points, points(i), max, i)
    }

    return max
  }

  def determineMinimumOfArray(points: Array[Point]): Double = {
    var min = Double.MaxValue

    if (points.length == 0) {
      "too less points"
    }

    for (i <- 0 to points.length - 1) {
      min = calculateMinimum(points, points(i), min, i)
    }

    return min
  }

  def calculateMaximum(points: Array[Point], startPoint: Point, maximum: Double, startVal: Int): Double = {
    var max: Double = maximum

    for (i <- startVal + 1 until points.size) {
      val maxTemp = determineDistance(startPoint, points(i))
      if (maxTemp > max) {
        max = maxTemp;
      }
    }

    return max
  }

  def calculateMinimum(points: Array[Point], startPoint: Point, minimum: Double, startVal: Int): Double = {
    var min: Double = minimum

    for (i <- startVal + 1 until points.size) {
      val minTemp = determineDistance(startPoint, points(i))
      if (minTemp < min) {
        min = minTemp;
      }
    }

    return min
  }
}

