name := "jsonparser"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.6.8",
  "org.scalatest" %% "scalatest" % "3.1.2" % Test
)
