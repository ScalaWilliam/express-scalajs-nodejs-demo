resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "Express on ScalaJS on NodeJS"
scalaVersion := "2.12.1"
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("Main")
libraryDependencies += "io.scalajs.npm" %%% "express" % "0.4.0-pre3"
