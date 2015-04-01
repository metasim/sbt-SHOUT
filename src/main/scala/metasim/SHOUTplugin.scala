package metasim

import java.io.{InputStreamReader, BufferedReader, PrintStream}
import java.net.HttpURLConnection

import sbt._
import sbt.complete.DefaultParsers._

object SHOUTplugin extends AutoPlugin {
    object autoImport {
        val sayAnything = any.+.string // spaceDelimited("Gimme what you got")
        val SHOUT = inputKey[String]("Get SBT to SHOUT")
    }

    import autoImport._

    override def projectSettings = Seq(
        SHOUT :=  {
            // curl -X POST -d '{"INPUT": "hello world"}' -H 'Content-Type: application/json'
            val what = trimmed(sayAnything).parsed

            val service = new URL("http://API.SHOUTCLOUD.IO/V1/SHOUT")
            val connection = service.openConnection().asInstanceOf[HttpURLConnection]
            connection.setDoOutput(true)
            connection.setAllowUserInteraction(false)
            connection.setRequestProperty("Content-Type", "application/json")
            val out = new PrintStream(connection.getOutputStream)
            out.print(s"""{"INPUT":"$what"}""")
            out.close()

            val resp = new BufferedReader(new InputStreamReader(connection.getInputStream))
            val line = resp.readLine()
            resp.close()

            val GetterOuter = """"OUTPUT":"([^"]*)"""".r.unanchored
            val GetterOuter(shouted) = line
            println(shouted)
            shouted
        }
    )
}
