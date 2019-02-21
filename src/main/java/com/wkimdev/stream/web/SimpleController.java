package com.wkimdev.stream.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wkimdev.stream.service.SimpleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SimpleController {
	
	@Autowired
	public SimpleService simpleService;
	
	@GetMapping("wkimdevs/simples/{message}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void Simples(@PathVariable("message") String message) {
		log.info("incoming message {}", message);
		simpleService.sendSimpleMessage(message);
	}
	
}
