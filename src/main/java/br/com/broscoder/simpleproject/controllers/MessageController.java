package br.com.broscoder.simpleproject.controllers;

import br.com.broscoder.simpleproject.errors.MessageNotFoundException;
import br.com.broscoder.simpleproject.models.Message;
import br.com.broscoder.simpleproject.services.interfaces.ServiceMessage;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.function.Function;

@RestController
public class MessageController {

    @Autowired
    private ServiceMessage service;

    @GetMapping
    public ResponseEntity<?> findAllMessages() {
        try {
            return ResponseEntity.ok(service.getAllMessage());
        } catch (MessageNotFoundException e) {
            return ResponseEntity.noContent().build();
        }
    }


    @PostMapping
    public ResponseEntity<?> createMessage(@RequestBody Message message) {
        return ResponseEntity.created(service.saveMessage(message)).build();
    }

    @DeleteMapping(value = "/posts/{id}")
    public ResponseEntity<?> deleteMessage(@PathVariable Long id) throws MessageNotFoundException{
        service.deletMessageById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/posts/{id}")
    public ResponseEntity<?> updateMessage(@PathVariable Long id, @RequestBody Message message) {
        try {
            return ResponseEntity.ok(service.updateMessageById(id, message));
        } catch (MessageNotFoundException
                 e) {
            return ResponseEntity.noContent().build();
        }
    }
}
