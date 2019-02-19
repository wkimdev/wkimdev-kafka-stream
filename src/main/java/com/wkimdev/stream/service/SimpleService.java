package com.wkimdev.stream.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.wkimdev.stream.model.Simples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("SimpleService")
public class SimpleService {
	
	@Autowired
	private SimpleStreams SimpleStreams;
	
	public void sendSimpleMessage(String message) {
		
		MessageChannel messageChannel = SimpleStreams.outboundSimple();
		
		Simples simples = Simples.builder().simpleMessage(message).build();
		
		messageChannel.send(MessageBuilder.withPayload(simples)
										  .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
										  .build());
		log.info("Sending simple Message {}", simples);
	}
	
}
