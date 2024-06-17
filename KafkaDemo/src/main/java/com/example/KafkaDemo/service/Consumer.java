package com.example.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "ak_topic",groupId = "ak_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("Received message is "+receivedMessage);

    }
}
