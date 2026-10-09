package com.example.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reddySekharController {
	@GetMapping("f-reddy")
	public String testController() {
		return "main";
	}


	@GetMapping("f2-reddy")
	public String testController2() {
		return "Hello reddy from feature branch2";
	}

}
