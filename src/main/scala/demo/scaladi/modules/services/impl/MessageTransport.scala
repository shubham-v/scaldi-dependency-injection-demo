package demo.scaladi.modules.services.impl

import demo.scaladi.modules.services.ITransport

class MessageTransport extends ITransport {
  override def send(s: String): Unit = println("Sending message: " + s)
}
