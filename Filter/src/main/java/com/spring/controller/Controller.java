package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class Controller {

	@GetMapping("/getname")
	public String name(@RequestAttribute("name") String name) {
		return "Hello " + name;
	}
}
