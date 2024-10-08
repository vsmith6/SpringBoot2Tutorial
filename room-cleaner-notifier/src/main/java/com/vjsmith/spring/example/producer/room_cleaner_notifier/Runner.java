package com.vjsmith.spring.example.producer.room_cleaner_notifier;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Runner implements CommandLineRunner{
	private final RabbitTemplate rabbitTemplate;
	private final ObjectMapper objectMapper;
	
	@Autowired
	private ConfigurableApplicationContext context;

	public Runner(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
		this.rabbitTemplate = rabbitTemplate;
		this.objectMapper = objectMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		int index = (int) ((Math.random()) * (28-1))+1;
		AsyncPayload payload = new AsyncPayload();
		payload.setId(index);
		payload.setModel("ROOM");
		rabbitTemplate.convertAndSend("operations", "smith.rooms.cleaner", objectMapper.writeValueAsString(payload));
		context.close();
	}
	
	

}
