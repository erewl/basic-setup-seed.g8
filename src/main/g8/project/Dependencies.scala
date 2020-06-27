import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1" % Test
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.3" % Test
  lazy val mUnit = "org.scalameta" %% "munit" % "0.7.9" % Test

  lazy val http4s = "org.http4s" %% "http4s-dsl" % "0.21.3"
  lazy val http4sServer = "org.http4s" %% "http4s-blaze-server" % "0.21.3"

  lazy val tapirVersion = "0.14.3"
  lazy val tapir = Seq(
    "com.softwaremill.sttp.tapir" %% "tapir-core",
    "com.softwaremill.sttp.tapir" %% "tapir-http4s-server",
    "com.softwaremill.sttp.tapir" %% "tapir-json-circe"
  ).map(_ % tapirVersion)

  lazy val circeVersion = "0.12.3"
  lazy val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  lazy val doobie = Seq(
    "org.tpolecat" %% "doobie-core" % "0.8.8",
    "org.tpolecat" %% "doobie-postgres" % "0.8.8"
  )

  lazy val sl4fj = "org.slf4j" % "slf4j-api" % "1.7.25"
  lazy val odin = Seq(
    "com.github.valskalla" %% "odin-core",
    "com.github.valskalla" %% "odin-json", //to enable JSON formatter if needed
    "com.github.valskalla" %% "odin-extras" //to enable additional features if needed (see docs)
  ).map(_ % "0.7.0")

  lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.12.3"

  lazy val catsCore = "org.typelevel" %% "cats-core" % "2.1.1"
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "2.1.3"

  lazy val fs2 = "co.fs2" %%% "fs2-core" % "2.4.0"

  lazy val enumeratum = "com.beachape" %% "enumeratum" % "1.6.0"

  val monocleVersion = "2.0.0" // depends on cats 2.x
  lazy val monocle = Seq(
    "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
    "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
    "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % "test"
  )
  lazy val newtype = "io.estatico" %% "newtype" % "0.4.4"
  lazy val WebDependencies = Seq(http4s, http4sServer) ++ tapir ++ circe

  lazy val DatabaseDependencies = doobie

  lazy val BasicDependencies =
    Seq(catsCore, catsEffect, enumeratum, pureConfig, monocle, newtype, fs2)

  lazy val LoggingDependencies = Seq(sl4fj, odin)

  lazy val TestDependencies = Seq(scalaTest, scalaCheck, mUnit)

}
