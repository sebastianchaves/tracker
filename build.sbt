organization := "com.tracker"
name := "tracker"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies ++= Dependencies.trackerDependencies
