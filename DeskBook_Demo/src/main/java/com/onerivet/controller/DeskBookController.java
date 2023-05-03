package com.onerivet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DeskBookController {

	@GetMapping
	public String test() {
		return "Hello Users!";
	}
	
}
