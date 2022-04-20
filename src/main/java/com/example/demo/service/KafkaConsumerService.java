package com.example.demo.service;

import com.example.demo.model.dto.Message;

public interface KafkaConsumerService {
    void consume(Message message);
}
