organization := "com.github.kikuomax"

name         := "spray-jwt"

version      := "0.0.2-cs3"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= Seq(
  "io.spray"          %% "spray-routing-shapeless2"   % "1.3.3",
  "com.typesafe.akka" %% "akka-actor"      % "2.4.17",
  "com.nimbusds"      %  "nimbus-jose-jwt" % "3.9.2"
)

publishMavenStyle := true

//publishTo := {
//  val prefix = "https://oss.sonatype.org/"
//  if (isSnapshot.value)
//    Some("snapshots" at prefix + "content/repositories/snapshots")
//  else
//    Some("releases" at prefix +"service/local/staging/deploy/maven2")
//}

publishTo := Some(Resolver.file("file",  new File( "/var/www/repository" )) )

publishArtifact in Test := false

licenses := Seq("MIT License" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/kikuomax/spray-jwt"))

pomExtra := (
  <scm>
    <url>https://github.com/kikuomax/spray-jwt.git</url>
    <connection>scm:git:https://github.com/kikuomax/spray-jwt.git</connection>
  </scm>
  <developers>
    <developer>
      <id>kikuomax</id>
      <name>Kikuo Emoto</name>
      <url>https://github.com/kikuomax</url>
    </developer>
  </developers>
)
