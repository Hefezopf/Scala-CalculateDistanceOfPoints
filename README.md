# ScalaCalcPoints

The Scala Program calculates the minimum distance of points.

Sample Coordinates: A(1, 1), B(1, 3), C(4, 4), D(6, 1) 

![Coordinates](src/main/resources/Coordinates.png "Coordinates")

Minimum distance of all points = 2.0


## Build

**sbt clean compile**

**sbt ~compile**

**sbt test**

**sbt testQuick**

**sbt ~testQuick**


## Run

**sbt run**

Output:

>Start App...
>
>Minimum distance of all points = 2.0

or run with params

**sbt "run (4,3) (5,2) (1,1) (1,2)"**

Calling the app with this params should result in:
 
Output:

>Start App...
>
>Minimum distance of all points = 1.0

Hint: Only use single digit numbers as point coordinates like (4,3)!



## Travis

Each commit to GitHub will result in a automated online travis CI/CD build.

https://travis-ci.com/github/Hefezopf/Scala-CalculateDistanceOfPoints
