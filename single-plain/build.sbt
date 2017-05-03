lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion in ThisBuild := "2.11.11"
)


lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
)

lazy val root = project
  .in(file("."))
  .settings(commonSettings: _*)
  .settings(dependencies: _*)
