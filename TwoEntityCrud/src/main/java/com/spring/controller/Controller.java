package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.dto.RegistrationDto;
import com.spring.entity.Registration;
import com.spring.service.RegisterService;

@RestController
@RequestMapping("/register")
public class Controller {

	@Autowired
	private RegisterService service;

	@PostMapping("/add")
	public String insert(@RequestBody RegistrationDto dto) {
		return service.insert(dto);
	}
	
	@GetMapping("/all")
	public List<RegistrationDto> viewall(){
		return service.viewall();
	}
	
	@GetMapping("/getid/{id}")
	public RegistrationDto getbyid(@PathVariable  int id) {
	return service.getbyid(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return service.deleteAll();
	}
	
	@GetMapping("/update")
	public void update(RegistrationDto dto,int id) {
		 service.update(dto, id);
	}
	
	}
