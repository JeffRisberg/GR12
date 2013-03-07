import grails.converters.JSON

import com.incra.Message
import com.incra.Thread

class BootStrap {

  def init = { servletContext ->

    // Register JSON Marshallers
    JSON.registerObjectMarshaller(Date) {
      return it?.format("MM/dd/yyyy")
    }

    // Set up test data
    Thread thread
    Message message

    thread = new Thread(title: "Topics")
    thread.save()

    thread = Thread.findByTitle("Topics")

    message = Message.findByAuthorAndText("Bob", "Water")
    if (message == null) {
      message = new Message(thread: thread, author: "Bob", text: "Water")
      message.save()
      thread.addToMessages(message)
    }

    message = Message.findByAuthorAndText("John", "Energy")
    if (message == null) {
      message = new Message(thread: thread, author: "John", text: "Energy")
      message.save()
      thread.addToMessages(message)
    }

    message = Message.findByAuthorAndText("Larry", "Materials")
    if (message == null) {
      message = new Message(thread: thread, author: "Larry", text: "Materials")
      message.save()
      thread.addToMessages(message)
    }
    thread.save()

    thread = new Thread(title: "Greek Letters")
    thread.save()

    thread = Thread.findByTitle("Greek Letters")

    message = Message.findByAuthorAndText("Bob", "Alpha")
    if (message == null) {
      message = new Message(thread: thread, author: "Bob", text: "Alpha")
      message.save()
      thread.addToMessages(message)
    }

    message = Message.findByAuthorAndText("Carol", "Omega")
    if (message == null) {
      message = new Message(thread: thread, author: "Carol", text: "Omega")
      message.save()
      thread.addToMessages(message)
    }

    thread.save()
  }

  def destroy = {
  }
}
