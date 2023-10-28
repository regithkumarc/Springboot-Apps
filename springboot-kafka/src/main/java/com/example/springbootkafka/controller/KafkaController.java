package com.example.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootkafka.service.Producer;

@RestController
@RequestMapping("/KafkaController")
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	
	@PostMapping("/publishMessage")
	public void messageToTopic(@RequestParam("message") String message) {
		producer.sendMessage(message);
	}
}
