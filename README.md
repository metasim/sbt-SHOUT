# SBT Plugin to [SHOUTCLOUD.IO](http://shoutcloud.io) "ALL CAPS" Service

*Because sometimes SBT just wants to SHOUT.*

[ ![Download](https://api.bintray.com/packages/metasim/sbt-plugins/sbt-shout/images/download.svg) ](https://bintray.com/metasim/sbt-plugins/sbt-shout/_latestVersion)

## Install

Add the following to your sbt `project/plugins.sbt` file:

```scala
resolvers += Resolver.url(
  "shouting-at-bintray",
  url("https://dl.bintray.com/metasim/sbt-plugins"))(
    Resolver.ivyStylePatterns)
addSbtPlugin("metasim" % "sbt-shout" % "0.0.0.0.0.2")
```

Note: this plugin targets sbt 0.13.x.

## Usage

Add this to your `build.sbt` file:


```scala
enablePlugins(SHOUTplugin)
```

Your project now supports the `SHOUT` input task which use the [SHOUTCLOUD.IO](http://shoutcloud.io) service to convert text into ALL CAPS!!

    > SHOUT Finally a nano-service that makes sense! 
    FINALLY A NANO-SERVICE THAT MAKES SENSE!
