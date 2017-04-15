# [Express](https://expressjs.com/) on [ScalaJS](https://www.scala-js.org/) on [NodeJS](https://nodejs.org/en/)

> Self-contained example for [scalajs-io/express](https://github.com/scalajs-io/express) by [Lawrence Daniels](https://github.com/ldaniels528)

Proof of concept if you wanted to integrate with the NodeJS platform rather than the JVM. Two cases spring to my mind:

* Some NodeJS libraries may be higher quality than JVM ones. In my case, [EventSource](https://www.npmjs.com/package/eventsource).
* Migrating incrementally from NodeJS to Scala without committing the heinous act known as [a code rewrite](https://www.joelonsoftware.com/2000/04/06/things-you-should-never-do-part-i/).

# Instructions

[Install SBT](https://www.scalawilliam.com/essential-sbt/) and [NodeJS](https://nodejs.org/en/download/package-manager/). 

```
$ git clone https://github.com/scalajs-io/express
$ cd express; npm install; sbt publishLocal; cd ..
$ git clone https://github.com/ScalaWilliam/express-scalajs-nodejs-demo
$ cd express-scalajs-nodejs-demo; npm install; sbt run
```

Then go to [localhost:8080](http://localhost:8080/?query=param).
