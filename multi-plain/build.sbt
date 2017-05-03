lazy val commonSettings = Seq(
  scalaVersion in ThisBuild := "2.11.11"
)

lazy val root = project
  .in(file("."))
  .aggregate(core, kernel)
  .settings(commonSettings: _*)

lazy val core = project
  .in(file("core-x"))
  .settings(commonSettings: _*)

lazy val kernel = project
  .in(file("kernel"))
  .settings(commonSettings: _*)
