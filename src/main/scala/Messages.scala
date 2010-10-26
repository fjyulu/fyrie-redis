package net.fyrie
package redis
package messages

import handlers.{Handler}

trait Message

case class Request[T: Manifest](bytes: Array[Byte], handler: Handler[T]) extends Message {
  val handlerManifest = implicitly[Manifest[T]]
}
