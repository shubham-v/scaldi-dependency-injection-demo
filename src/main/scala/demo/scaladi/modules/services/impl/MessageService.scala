package demo.scaladi.modules.services.impl

import demo.scaladi.modules.services.{IService, ITransport}

class MessageService(transport: ITransport) extends IService {
  override def execute(x: String): String = {
    val message = "Hello " + x
    transport.send(message)
    return message
  }
}
