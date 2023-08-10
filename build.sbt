name := """graph-journey"""
organization := "jay.bhavsar"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.11"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "jay.bhavsar.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "jay.bhavsar.binders._"
