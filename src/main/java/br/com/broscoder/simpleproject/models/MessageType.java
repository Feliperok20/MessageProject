package br.com.broscoder.simpleproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MessageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Message message;


}
