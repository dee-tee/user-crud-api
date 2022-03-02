package com.user.example.usercrudapi.services;

import com.user.example.usercrudapi.entities.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

    @Service
    public class KafkaConsumer {

        @KafkaListener(topics = "Kafka_Example", groupId = "group_json",
                containerFactory = "userKafkaListenerFactory")
        public void consumeJson(User user) {
            System.out.println("Consumed JSON Message: " + user);

        }
    }

