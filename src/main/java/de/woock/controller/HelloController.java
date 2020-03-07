package de.woock.controller;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${communication.hello}")
	String greeting;
	
	@GetMapping("/hello")
    public String info() throws UnknownHostException {
       return String.format("%s", greeting);
	}
}
