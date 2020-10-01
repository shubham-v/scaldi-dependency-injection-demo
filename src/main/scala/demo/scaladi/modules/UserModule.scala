package demo.scaladi.modules

import demo.scaladi.modules.services.{IService, ITransport}
import demo.scaladi.modules.services.impl.{MessageService, MessageTransport}
import scaldi.Module

class UserModule extends Module {
  bind [ITransport] to new MessageTransport
  bind [IService] to  new MessageService(inject[ITransport])
}