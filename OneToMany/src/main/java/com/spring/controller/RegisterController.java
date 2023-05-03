package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.RegisterDto;
import com.spring.service.RegisterService;

@RequestMapping("/register")
@RestController
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@PostMapping("/add")
	public String insert(@RequestBody RegisterDto dto) {
		return 	service.insert(dto);
		
	}
}
