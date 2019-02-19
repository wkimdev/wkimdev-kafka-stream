package com.wkimdev.stream;

import org.springframework.cloud.stream.annotation.Input;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SimpleStreams {
	
	String INPUT = "simple-in";
	String OUTPUT = "simple-out";
	
	@Input(INPUT)
	SubscribableChannel inboundSimple();
	
	@Output(OUTPUT)
	MessageChannel outboundSimple();

}
