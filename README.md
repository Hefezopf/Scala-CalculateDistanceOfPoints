# ScalaCalcPoints

The Scala Program calculates the minimum and maximum distance of points.

Sample Coordinates: A(1, 1), B(1, 3), C(4, 4), D(6, 1) 

![Coordinates](src/main/resources/Coordinates.png "Coordinates")

Minimum distance of all points = 2.0

Maximum distance of all points = 5.385164807134504


## Build

As IDE use Visual Studio Code or Eclipse Scala

**sbt clean compile**

**sbt ~compile**


## Test

Run JUnit Tests

**sbt test**

**sbt testQuick**

**sbt ~testQuick**


## Run

**sbt run**

>Start App...
>
>Minimum distance of all points = 2.0
>
>Maximum distance of all points = 5.385164807134504

or run with params

**sbt "run (4,3) (5,2) (1,1) (1,2)"**

Calling the app with this params should result in:
 
>Start App...
>
>Minimum distance of all points = 1.0
>
>Maximum distance of all points = 4.123105625617661

Hint: Only use single digit numbers as point coordinates like (4,3)!


## CI/CD

Each commit to GitHub will result in a automated online CI/CD build.


### GitHub

GitHub Action CI/CD build:

https://github.com/Hefezopf/Scala-CalculateDistanceOfPoints/actions


### Travis

Travis CI/CD build:

https://travis-ci.com/github/Hefezopf/Scala-CalculateDistanceOfPoints
