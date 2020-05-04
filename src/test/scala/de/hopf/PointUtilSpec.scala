package test.scala.de.hopf

import collection.mutable.Stack
import org.scalatest._
import main.scala.de.hopf.Point
import main.scala.de.hopf.PointUtil

class PointUtilSpec extends FlatSpec {

  "A PointUtil" should "determineMinimum" in {

    val pointUtil = PointUtil.determineMinimum(new Point(1,4), new Point(2,3))
    
    assert(pointUtil == 1.4142135623730951)
  }

}