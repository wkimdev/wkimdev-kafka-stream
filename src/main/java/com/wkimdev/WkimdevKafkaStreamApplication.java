package com.wkimdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.wkimdev.stream.SimpleStreams;

@SpringBootApplication
@EnableBinding(SimpleStreams.class)
public class WkimdevKafkaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(WkimdevKafkaStreamApplication.class, args);
	}

}
