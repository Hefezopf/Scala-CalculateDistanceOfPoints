package org

object Calculator extends App {
  println("Start!!!!!!")

  var points: Array[Point] = Array(new Point(1, 4), new Point(2, 3), new Point(3, 2), new Point(4, 1))

  val minDistance = PointUtil.determineMinimum(points(0), points(1))
  println("Distance: " + minDistance)

  val minDistanceOfArray: Double = PointUtil.determineMinimumOfArray(points)
  println("Distance of Array: " + minDistanceOfArray)
}
