package com.example.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "kafka_topic", groupId = "group_id")
	public void consumeMessage(String message) {
		System.out.println("Kafka Message : " + message);
	}

}
