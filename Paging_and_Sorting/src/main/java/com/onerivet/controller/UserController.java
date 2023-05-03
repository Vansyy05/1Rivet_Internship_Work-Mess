package com.onerivet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.entity.User;
import com.onerivet.service.UserService;

@RestController
@RequestMapping("/paging")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public String add(@RequestBody User insert) {
		return service.add(insert);
	}	
	
	
	@GetMapping("/")
	public List<User> getAll(
			@RequestParam(value="pageNumber",defaultValue = "0")int pageNumber,
			@RequestParam(value="pageSize",defaultValue = "5")int pageSize,
			@RequestParam(value="sortBy",defaultValue="name")String sortBy){
		return service.getAll(pageNumber,pageSize,sortBy);
	}
	
	@GetMapping("/all")
	public List<User> getAll(){
		return service.getAll();
	}
}
