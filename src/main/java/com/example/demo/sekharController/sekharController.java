package com.example.demo.sekharController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sekharController {
	@GetMapping("/f-sekhar")
	public String getSekharController() {
		return "f-sekhar";
	}
}
