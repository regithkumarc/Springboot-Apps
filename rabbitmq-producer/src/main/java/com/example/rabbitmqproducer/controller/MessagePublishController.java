package com.example.rabbitmqproducer.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmqproducer.config.MQConfig;
import com.example.rabbitmqproducer.model.CustomMessage;

@RestController
@RequestMapping("/MessagePublishController")
public class MessagePublishController {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostMapping("/publishMessage")
	public String publishMessage(@RequestBody CustomMessage customMessage) {
		customMessage.setMessageId(UUID.randomUUID().toString());
		customMessage.setMessageDate(new Date());
		
		rabbitTemplate.convertAndSend(MQConfig.MESSAGE_EXCHANGE,
				MQConfig.MESSAGEROUTING_KEY,customMessage);
		
		return "Message Published";
	}
}
