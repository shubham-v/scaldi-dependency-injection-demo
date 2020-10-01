import demo.scaladi.modules.UserModule
import demo.scaladi.modules.services.IService
import scaldi.{Injectable, Injector}

class Main extends Injectable {
  def run: Unit = {
    implicit val injector:Injector = new UserModule
    val output:IService = inject[IService]
    println(output.execute("scaldi"))
  }
}

object Main {
  def main(args: Array[String]) {
    val test = new Main;
    test.run
  }
}