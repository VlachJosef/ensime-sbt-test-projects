lazy val commonSettings = Seq(
  scalaVersion in ThisBuild := "2.11.11"
)

lazy val root = project
  .in(file("."))
  .aggregate(core, kernel)
  .settings(commonSettings: _*)

lazy val core = project
  .in(file("core-x"))
  .enablePlugins(PlayScala)
  .settings(commonSettings: _*)

lazy val kernel = project
  .in(file("kernel"))
  .enablePlugins(PlayScala)
  .settings(commonSettings: _*)
