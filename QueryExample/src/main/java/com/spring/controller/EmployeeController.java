package com.spring.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.EmployeeDto;
import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

import jakarta.validation.Valid;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/insert")
	public String insert(@Valid EmployeeDto dto) {
		return employeeservice.insert(dto);
	}
	
	@GetMapping("/viewall")
	public List<EmployeeDto> viewall(){
		return employeeservice.viewall();
		
	}
	
	@GetMapping("/getid/{id}")
	public EmployeeDto getbyid(@PathVariable int id) {
		return employeeservice.getbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody EmployeeDto dto) {
		return employeeservice.update(id, dto);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		return employeeservice.deleteById(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return employeeservice.deleteAll();
	}
	
	@GetMapping("/getbycity")
	public List<EmployeeDto> getByCity(@RequestParam String city){
		return employeeservice.getByCity(city);
	}
	
	@GetMapping("/getbysalary")
	public List<EmployeeDto> getBySalary(@RequestParam int Salary){
		return employeeservice.getBySalary(Salary);
	}
	
	@GetMapping("/getfullname")
	public List<EmployeeDto> getByFirstnameAndLastname(@RequestParam String firstname,@RequestParam String lastname){
		return employeeservice.getByFirstnameAndLastname(firstname, lastname);
	}
	
	@GetMapping("/getbyfirstname")
	public List<EmployeeDto> getByFirstname(String firstname){
		return employeeservice.getByFirstname(firstname);
	}
	
	@GetMapping("/pincode")
	public List<EmployeeDto> getByPincode(int pincode){
		return employeeservice.getByPincode(pincode);
	}
	
	@GetMapping("/getbylastname")
	public List<EmployeeDto> getByLastname(String lastname){
		return employeeservice.getByLastname(lastname);
	}
	
	@GetMapping("/getpincity")
	public List<EmployeeDto> getByPinCity(int pincode,String city){
		return employeeservice.getByPinCity(pincode, city);
	}
	
	@GetMapping("/getbyage")
	public List<EmployeeDto> getByAge(int age) {
		return employeeservice.getByAge(age);
	}
	
	@GetMapping("/getfirstnameemail")
	public List<EmployeeDto> getByFirstnameEmail(String firstname,String email){
		return employeeservice.getByFirstnameEmail(firstname, email);
	}
	
	@GetMapping("/getlastnameemail")
	public List<EmployeeDto> getByLastnameEmail(String lastname,String email){
		return employeeservice.getBylastnameEmail(lastname, email);
	}
}

