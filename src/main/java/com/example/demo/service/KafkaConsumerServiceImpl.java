package com.example.demo.service;

import com.example.demo.model.dto.Message;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    @Override
    @KafkaListener(groupId = "${kafka.group.id}", topics = "${kafka.topic.message}")
    public void consume(Message message) {

    }
}
