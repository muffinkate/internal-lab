val scala3Version = "3.2.2"

// ThisBuild / name := "Scala machines"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := scala3Version
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-explain"
)
ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
ThisBuild / libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4" % Test

lazy val loop_until = project
lazy val for_loop = project
lazy val while_c = project
lazy val repeat_until = project
