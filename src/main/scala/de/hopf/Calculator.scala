package main.scala.de.hopf

object Calculator extends App {
  println("Start App...!!!")

  var points: Array[Point] = Array()
  //var args1: Array[String] = Array("(4,3)", "(5,2)", "(1,1)", "(1,2)")
  if (args.length > 0) {
    points = PointUtil.parseAllCoords(args)
  } else {
    points = Array(new Point(1, 1), new Point(1, 3), new Point(4, 4), new Point(6, 1))
  }

  val minDistanceOfArray: Double = PointUtil.determineMinimumOfArray(points)
  println("Minimum distance of all points = " + minDistanceOfArray)
}
