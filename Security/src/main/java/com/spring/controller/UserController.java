package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.service.UserService;


@RestController
@RequestMapping("/userhome")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/add")
	public String insert(User u) {
		return service.insert(u);
	}
	
	@GetMapping("/viewall")
	public List<User> viewall(){
	return service.viewall();
	}
}
