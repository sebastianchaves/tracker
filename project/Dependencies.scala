import sbt._

object Dependencies {

  val scalaTestPlusPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
  
  val mongojack = "org.mongojack" % "mongojack" % "2.10.0"
  val mongoJavaDriver = "org.mongodb" % "mongo-java-driver" % "3.10.2"
  
  val asyncHttpClient = "org.asynchttpclient" % "async-http-client" % "2.10.0"

  val coursier = "io.get-coursier" %% "coursier" % "1.1.0-M14-7"

  val trackerDependencies: Seq[ModuleID] = Seq(scalaTestPlusPlay, 
                                               mongojack, 
                                               mongoJavaDriver, 
                                               asyncHttpClient, 
                                               coursier)
  
}
