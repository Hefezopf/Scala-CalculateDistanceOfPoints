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
  
  "A PointUtil" should "determineMinimumOfArray" in {

    var points:Array[Point]=new Array[Point](4)
    points(0)=new Point(1,1)
    points(1)=new Point(1,3)
    points(2)=new Point(4,4)
    points(3)=new Point(6,1)
    
    val pointUtil = PointUtil.determineMinimumOfArray(points)
    
    assert(pointUtil == 2.0)
  }

}