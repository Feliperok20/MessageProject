package br.com.broscoder.simpleproject;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@SpringBootApplication
public class SimpleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProjectApplication.class, args);
    }

}
//
//@RestController
//class MessageApplication {
//
//    @Autowired
//    private MessageDAO dao;
//
//    @GetMapping
//    public List<Message> getMessages() {
//        return dao.findAll();
//    }
//
//    @PostMapping
//    public void createMessage(@RequestBody Message message) {
//        dao.save(message);
//    }
//
//}
//
//@Entity
//@Data
//class Message {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String message;
//}
//
//@Repository
//interface MessageDAO extends JpaRepository<Message, Long> {
//
//}
