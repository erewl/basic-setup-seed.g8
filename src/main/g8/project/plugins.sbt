addCompilerPlugin(
  "org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full
)
addSbtPlugin(
  "org.scalameta" % "sbt-scalafmt" % "2.4.0"
) // "2.4.0" is just sbt plugin version
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.4.2")
