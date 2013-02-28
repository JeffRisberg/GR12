import com.incra.Message
import com.incra.Thread

class BootStrap {

  def init = { servletContext ->

    Thread thread
    Message message

    thread = new Thread(title: "Topics")
    thread.save()

    message = new Message(thread: thread, author: "Bob", text: "Water")
    message.save()
    thread.addToMessages(message)

    message = new Message(thread: thread,author: "John",  text: "Energy")
    message.save()
    thread.addToMessages(message)

    message = new Message(thread: thread, author: "Larry", text: "Materials")
    message.save()
    thread.addToMessages(message)

    thread.save()

    thread = new Thread(title: "Greek Letters")
    thread.save()

    message = new Message(thread: thread, author: "Bob", text: "Alpha")
    message.save()
    thread.addToMessages(message)

    message = new Message(thread: thread, author: "Carol", text: "Omega")
    message.save()
    thread.addToMessages(message)

    thread.save()
  }

  def destroy = {
  }
}
