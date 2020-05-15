package main.scala.de.hopf

object Calculator extends App {
  println("Start App...!!!")

  var points: Array[Point] = Array(new Point(1, 1), new Point(1, 3), new Point(4, 4), new Point(6, 1))

  println("Distance: " + PointUtil.determineMinimum(points(0), points(2)))

  val minDistanceOfArray: Double = PointUtil.determineMinimumOfArray(points)
  println("Minimum distance of all points = " + minDistanceOfArray)
}
