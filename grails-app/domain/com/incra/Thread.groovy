package com.incra

class Thread {

  String title

  static hasMany = [messages: Message]

  static constraints = {
    title(unique: true, empty: false)
  }

  public String toString() {
    StringBuffer sb = new StringBuffer()

    sb.append("Thread[title=" + title)
    if (messages) {
      sb.append(", messages=[")
      messages.each { Message message ->
        sb.append(message.text)
      }
      sb.append("]")
    }
    sb.append("]")

    sb.toString()
  }
}
