import bintray.Keys._

sbtPlugin := true

organization := "metasim"

name := "sbt-SHOUT"

version := "0.0.0.0.0.3-SNAPSHOT"

scalaVersion := "2.10.4"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None
