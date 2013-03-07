package com.incra

import grails.converters.JSON

/**
 * Handles AJAX requests from the backbone.js front-end
 * 
 * @author Jeffrey Risberg
 * @since January 2013
 */
class ThreadAPIController {

  ThreadService threadService

  def index = {
    println "index"
    List<Thread> allThreads = threadService.getAll()
    println "" + allThreads.size() + " threads"
    allThreads.each { println it }
    JSON.use('deep')
    render( allThreads as JSON )
  }

  def save = {
    println "save"
    def thread = new Thread(request.JSON)
    JSON.use('deep')
    render( thread.save() as JSON )
  }

  def show = {
    println "show " + params.id
    def thread = Thread.findById(params.id)
    JSON.use('deep')
    render(thread as JSON );
  }

  def delete = {
    println "delete " + params.id
    def thread = Thread.findById(params.id)
    thread?.delete()
    JSON.use('deep')
    render(thread as JSON );
  }

  def update = {
    println "update " + params.id
    def thread = Thread.findById(params.id)
    bindData(thread, request.JSON)
    JSON.use('deep')
    render(thread.save() as JSON )
  }
}
