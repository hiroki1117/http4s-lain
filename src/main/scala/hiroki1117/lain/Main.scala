package hiroki1117.lain

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    LainServer.stream[IO].compile.drain.as(ExitCode.Success)
}