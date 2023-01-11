package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {

	@GetMapping("/")
	String returnHello() {
		return "Hello Ericsson";
	}
	
	@GetMapping("/greeting")
	String returnGreeting(@RequestParam String name) {
		return "<h1>Hello, "+name+"</h1>";
	}
}
