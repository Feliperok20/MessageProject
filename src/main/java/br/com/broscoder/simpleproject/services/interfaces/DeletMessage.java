package br.com.broscoder.simpleproject.services.interfaces;

import br.com.broscoder.simpleproject.models.Message;

import java.util.Set;

public interface DeletMessage {
    boolean delete(Long id);
    Set<Message> all();
}
