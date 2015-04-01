lazy val root = Project("plugins", file(".")) dependsOn (SHOUT)

lazy val SHOUT = file("..").getAbsoluteFile.toURI
