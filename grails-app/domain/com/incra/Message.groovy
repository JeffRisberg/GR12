package com.incra

/**
 * Message domain Object
 */
class Message {

  String author
  String text

  static def belongsTo = [thread: Thread]

  static constraints = {
    author(empty: false)
    text(nullable: false)
  }

  public String toString() {
    StringBuffer sb = new StringBuffer()

    sb.append("Message[author=" + author)
    sb.append("text=" + text)
    sb.append("]")

    sb.toString()
  }
}
