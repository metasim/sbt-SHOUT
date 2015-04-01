import bintray.Keys._

sbtPlugin := true

organization := "metasim"

name := "sbt-SHOUT"

version := "0.0.0.0.0.2"

scalaVersion := "2.10.4"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

// This is an example.  bintray-sbt requires licenses to be specified
// (using a canonical name).
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None
