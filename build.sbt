ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "de.hopf"

lazy val myProject = (project in file("."))
  .settings(
    name := "ScalaCalcPoints",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"  
  )
