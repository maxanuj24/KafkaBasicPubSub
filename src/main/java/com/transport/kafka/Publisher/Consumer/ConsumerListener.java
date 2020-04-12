package com.transport.kafka.Publisher.Consumer;

import com.transport.kafka.Publisher.Publish.User;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "myStringTopic",groupId="Group_String")
    public void ConsumeMessage(String message){
       System.out.print("Consumed Message : "+message);
   }

    @KafkaListener(topics = "myUserTopic",groupId="Group_Json")
    public void ConsumeMessage(User message){
        System.out.print("Consumed Message : "+message);
    }
}
