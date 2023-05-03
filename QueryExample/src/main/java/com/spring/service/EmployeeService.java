package com.spring.service;

import java.util.List;

import com.spring.dto.EmployeeDto;
import com.spring.entity.Employee;

public interface EmployeeService {
	
	public String insert(EmployeeDto dto) ;
	
	public List<EmployeeDto> viewall();
	
	public EmployeeDto getbyid(int id);
	
	public String update(int id,EmployeeDto dto);
	
	public String deleteById(int id);
	
	public String deleteAll();

	public List<EmployeeDto> getByFirstname(String firstname);
	
	public List<EmployeeDto> getByLastname(String lastname);
	
	public List<EmployeeDto> getByCity(String city);
	
	public List<EmployeeDto> getBySalary(int salary);
	
	public List<EmployeeDto> getByFirstnameAndLastname(String firstname, String lastname);
	
	public List<EmployeeDto> getByPincode(int pincode);
	
	public List<EmployeeDto> getByPinCity(int pincode,String city);
	
	public List<EmployeeDto> getByAge(int age);
	
	public List<EmployeeDto> getByFirstnameEmail(String firstname,String email);
	
	public List<EmployeeDto> getBylastnameEmail(String lastname,String email);
	
	
}
	

	

