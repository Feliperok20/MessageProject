package br.com.broscoder.simpleproject.services.interfaces;

import br.com.broscoder.simpleproject.errors.MessageNotFoundException;
import br.com.broscoder.simpleproject.models.Message;

import java.net.URI;
import java.util.List;

public interface ServiceMessage {

   URI saveMessage(Message message);

    List<Message> getAllMessage() throws MessageNotFoundException;

    void deletMessageById(Long id) throws MessageNotFoundException;

    Message updateMessageById(Long id, Message message) throws MessageNotFoundException;
}
