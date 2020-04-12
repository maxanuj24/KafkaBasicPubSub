package com.transport.kafka.Publisher.Publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {
    public static final String TOPIC ="myUserTopic";
  /*  @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/publish/{message}")
    public String publishString(@PathVariable String message){
            kafkaTemplate.send(TOPIC,"This is my published message "+message);
        return "Published";
    }*/

    @Autowired
    private KafkaTemplate<String, User> kafkaUserTemplate;
    @GetMapping("/publish/{id}/{name}/{desc}")
    public String publishUser(@PathVariable int id,@PathVariable String name,@PathVariable String desc){
        kafkaUserTemplate.send(TOPIC,new User(id,name,desc));
        return "Published User with name: "+name;
    }
}
