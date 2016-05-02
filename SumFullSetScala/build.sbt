import sbt.Keys._

val scalactic = "org.scalactic" %% "scalactic" % "2.2.6"
val scalatest = "org.scalatest" %% "scalatest" % "2.2.6" % "test"

lazy val commonSettings = Seq(
  organization := "com.hydral",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)


lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "Sum Full Set",
    libraryDependencies ++= Seq(
      scalactic,
      scalatest
    )
    //libraryDependencies += scalactic,
    //libraryDependencies += scalatest
  )

    

