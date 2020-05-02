package org

import scala.math.sqrt;
import scala.math.pow;

class Point(var x: Int, var y: Int) {

  def determineMinimum(p1: Point, p2: Point): Double = {
    sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
  }

  def determineMinimumOfArray(points: Array[Point]) {
    if (points.length == 0) { "too less points" }
    var min = Double.MaxValue
    for (i <- 0 until points.length) {
      val startPoint = points(i);
      min = calculate(points, startPoint, min, i);
    }
    return min;
  }

  def calculate(points: Array[Point], startPoint: Point, minimum: Double, startVal: Int): Double = {
    var min: Double = minimum;
    for (i <- startVal + 1 until points.size) {
      val minTemp = determineMinimum(startPoint, points(i));
      if (minTemp < min) min = minTemp;

    }
    return min
  }
}

