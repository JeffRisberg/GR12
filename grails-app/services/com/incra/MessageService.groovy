package com.incra

/**
 * Business logic related to challenge management is being migrated into this service.
 * 
 * @author Jeffrey Risberg
 * @since December 2012
 */
class MessageService {

  List<Message> getAll() {
    Message.findAll()
  }
}
