package br.com.broscoder.simpleproject.repositories.interfaces;

import br.com.broscoder.simpleproject.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface RepositoryMessage extends JpaRepository<Message, Long>  {

    List<Message> findAllByMessage(String message);
}
