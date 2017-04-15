import io.scalajs.JSON
import io.scalajs.nodejs._
import io.scalajs.npm.express._

import scala.scalajs.js.JSApp

object Main extends JSApp {
  private def port: ExitCode =
    io.scalajs.nodejs.process.env.get("PORT").map(_.toInt).getOrElse(8080)

  override def main(): Unit = {
    Express()
      .get("/", (req: Request, res: Response) => {
        res.send(s"Hello! ${JSON.stringify(req.query)}")
      })
      .listen(port)
  }
}
