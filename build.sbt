name := """Stream-play"""
organization := "com.gussoft"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += ws
libraryDependencies += evolutions

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.18"
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.4.2.Final"
//  "commons-validator"%"commons-validator"%"1.4.1",
libraryDependencies += "com.auth0"%"java-jwt"%"2.2.0"
