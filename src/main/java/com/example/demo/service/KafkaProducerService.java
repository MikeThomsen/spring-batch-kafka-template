package com.example.demo.service;

import com.example.demo.model.dto.Message;

public interface KafkaProducerService {
    void produce(Message message);
}
