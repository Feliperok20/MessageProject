package br.com.broscoder.simpleproject.services;

import br.com.broscoder.simpleproject.errors.MessageNotFoundException;
import br.com.broscoder.simpleproject.models.Message;
import br.com.broscoder.simpleproject.repositories.interfaces.RepositoryMessage;
import br.com.broscoder.simpleproject.services.interfaces.ServiceMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static br.com.broscoder.simpleproject.constants.Path.MainPath;

@Service
public class ServiceMessageImpl implements ServiceMessage {
ServiceMessage ob;
    @Autowired
    private RepositoryMessage repository;

    @Override
    public URI saveMessage(Message message) {
        repository.save(message);
        return URI.create(MainPath.getAddress());
    }

    @Override
    public List<Message>  getAllMessage() throws MessageNotFoundException {
        List<Message> messages = repository.findAll();
        if(messages.isEmpty()) {
            throw new MessageNotFoundException("Nenhuma mensagem encontrada");
        }
        return messages;
    }

    @Override
   public void deletMessageById(Long Id) {
        repository.deleteById(Id);
    }

//    @Override
//    public void updateMessageById(Long Id, Message message) {
//        Optional<Message> messageById = repository.findById(Id);
//        messageById.get().setMessage(message.getMessage());
//        repository.save(messageById.get());
//    }


    @Override
    public Message updateMessageById(Long id, Message message) throws MessageNotFoundException {
        Optional<Message> messageOptional = repository.findById(id);
        Message updatedMessage = messageOptional.orElseThrow(() -> new MessageNotFoundException("Message not found"));
        updatedMessage.setMessage(message.getMessage());
        return repository.save(updatedMessage);
    }


}
