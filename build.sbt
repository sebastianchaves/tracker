organization := "com.tracker"
name := "tracker"
scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies ++= Dependencies.trackerDependencies
