package com.spring.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student.entity.StudentEntity;
import com.spring.student.studentservice.StudnetService;

@RequestMapping("/studentuser")
@RestController
public class StudentController {
	
	@Autowired
	private StudnetService student;
	
	@PostMapping("/insert")
	public String insert(StudentEntity s) {
		return student.insert(s);
	}
	
	@GetMapping("/viewall")
	public List<StudentEntity> viewall(){
	return student.viewall();
	}
	
	@GetMapping("/getid/{id}")
	public Optional<StudentEntity> getById(@PathVariable int id) {
		return student.getById(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		return student.deleteById(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return student.deleteAll();
	}
	
	@PutMapping("/update/{id}")
	public StudentEntity update(@PathVariable int id,@RequestBody StudentEntity s) {
		return student.update(id, s);
	}
	
	@GetMapping("/getbyname")
	public List<StudentEntity> getByName(String name) {
		return student.getByName(name);
	}
	
	@GetMapping("/getaddress")
	public List<StudentEntity> getByAddress(String address) {
		return student.getByAddress(address);
		
	}
}
