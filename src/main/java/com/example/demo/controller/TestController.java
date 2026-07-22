package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/get")
	public String getTest() {
		return "Hello Testing!";
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "hello reddy";

	}
}
