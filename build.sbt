ThisBuild / scalaVersion := "2.12.3"
ThisBuild / organization := "de.hopf"

lazy val myProject = (project in file("."))
  .settings(
    name := "ScalaCalcPoints",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  
  )
