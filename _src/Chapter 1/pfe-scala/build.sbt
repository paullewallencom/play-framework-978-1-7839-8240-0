name := """pfe-scala"""

version := "1.0-SNAPSHOT"

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"

scalacOptions += "-feature"

lazy val `pfe-scala` = project.in(file(".")).enablePlugins(PlayScala)
