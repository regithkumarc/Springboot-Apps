package com.example.rabbitmqconsumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmqconsumer.config.MQConfig;
import com.example.rabbitmqconsumer.model.CustomMessage;

@Component
public class MessageListener {

	@RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
	public void listener(CustomMessage customMessage) {
		System.out.println(customMessage);
	}
}
