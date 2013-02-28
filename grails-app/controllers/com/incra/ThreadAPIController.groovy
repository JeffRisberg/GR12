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
    List<Thread> allChallenges = threadService.getAll()
    println "" + allChallenges.size() + " threads"
    render( allChallenges as JSON )
  }

  def save = {
    println "save"
    def thread = new Thread(request.JSON)
    render( thread.save() as JSON )
  }

  def show = {
    println "show " + params.id
    def thread = Thread.findById(params.id)
    render(thread as JSON );
  }

  def delete = {
    println "delete " + params.id
    def thread = Thread.findById(params.id)
    thread?.delete()
    render(thread as JSON );
  }

  def update = {
    println "update " + params.id
    def thread = Thread.findById(params.id)
    bindData(thread, request.JSON)
    render(thread.save() as JSON )
  }
}
