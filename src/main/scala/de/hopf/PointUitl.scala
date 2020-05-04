package main.scala.de.hopf

import scala.math.sqrt;
import scala.math.pow;

object PointUtil {

  def determineMinimum(p1: Point, p2: Point): Double = {
    sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2))
  }

  def determineMinimumOfArray(points: Array[Point]): Double = {
    if (points.length == 0) { "too less points" }
    var min = Double.MaxValue
    println("points.length: " + points.length)
    println("points(0).x: " + points(0).x)
    println("points(0).y: " + points(0).y)

    for (i <- 0 to points.length - 1) {
      min = calculate(points, points(i), min, i)
    }

    return min
  }

  def calculate(points: Array[Point], startPoint: Point, minimum: Double, startVal: Int): Double = {
    var min: Double = minimum
    for (i <- startVal + 1 until points.size) {
      val minTemp = determineMinimum(startPoint, points(i))
      if (minTemp < min) min = minTemp;

    }
    return min
  }
}

