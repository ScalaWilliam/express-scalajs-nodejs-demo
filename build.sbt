resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "Express on ScalaJS on NodeJS"
scalaVersion := "2.12.3"
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("Main")
libraryDependencies += "io.scalajs.npm" %%% "express" % "4.14.1"
