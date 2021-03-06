import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "de.erewl"
ThisBuild / organizationName := "erewl"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= BasicDependencies ++ TestDependencies ++ LoggingDependencies
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
