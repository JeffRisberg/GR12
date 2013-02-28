package com.incra

import grails.converters.JSON

/**
 * Handles AJAX requests from the backbone.js front-end
 * 
 * @author Jeffrey Risberg
 * @since January 2013
 */
class MessageAPIController {

  MessageService messageService

  def index = {
    println "index"
    List<Thread> allMessages = messageService.getAll()
    println "" + allMessages.size() + " messages"
    render( allMessages as JSON )
  }
}
