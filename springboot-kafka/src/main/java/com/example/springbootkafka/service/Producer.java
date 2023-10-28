package com.example.springbootkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPIC = "kafka_topic"; 
	
	public void sendMessage(String message) {
		kafkaTemplate.send(TOPIC,message);
	}

}
