lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion in ThisBuild := "2.11.11",
  libraryDependencies ++= Seq(
    "com.softwaremill.macwire" %% "macros" % "2.3.0",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
)

lazy val root = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(commonSettings: _*)
