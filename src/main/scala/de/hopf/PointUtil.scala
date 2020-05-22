package main.scala.de.hopf

import scala.math.sqrt;
import scala.math.pow;
import scala.util.matching.Regex
import scala.collection._

object PointUtil {

  def parseAllCoords(allCoords: Array[String]): Array[Point] = {
    var points: Array[Point] = Array()
    val pointsList = mutable.MutableList[Point]()

    for (i <- 0 to allCoords.length - 1) {
      var xy: Array[Integer] = parseToCoord(allCoords(i))
      var p = new Point(xy(0), xy(1))
      pointsList += p;
    }
    points = pointsList.toArray

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

  def determineMinimum(p1: Point, p2: Point): Double = {
    sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2))
  }

  def determineMinimumOfArray(points: Array[Point]): Double = {
    var min = Double.MaxValue

    if (points.length == 0) {
      "too less points"
    }

    for (i <- 0 to points.length - 1) {
      min = calculate(points, points(i), min, i)
    }

    return min
  }

  def calculate(points: Array[Point], startPoint: Point, minimum: Double, startVal: Int): Double = {
    var min: Double = minimum

    for (i <- startVal + 1 until points.size) {
      val minTemp = determineMinimum(startPoint, points(i))
      if (minTemp < min) {
        min = minTemp;
      }
    }

    return min
  }
}

