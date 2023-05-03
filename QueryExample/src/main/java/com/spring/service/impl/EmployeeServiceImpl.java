package com.spring.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.EmployeeDto;
import com.spring.entity.Employee;
import com.spring.repository.EmployeeRepositroy;
import com.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositroy employee;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Employee employeeDtoToEmployee(EmployeeDto employeedto) {
		Employee employee=this.modelMapper.map(employeedto, Employee.class);
		return employee;
	}
	
	private EmployeeDto EmployeeToemployeeDto(Employee employee) {
		EmployeeDto employeedto=this.modelMapper.map(employee,EmployeeDto.class);
		return employeedto;
	}

	@Override
	public String insert(EmployeeDto dto) {
		employee.save(employeeDtoToEmployee(dto));
		return "User Inserted Successfully...";
	}

	@Override
	public List<EmployeeDto> viewall() {
		List<Employee> e=employee.findAll();
		List<EmployeeDto> employeedto=employee.findAll().stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
		return employeedto;
	}

	@Override
	public EmployeeDto getbyid(int id) {
		Employee e=this.employee.findById(id).get();
		return this.EmployeeToemployeeDto(e);
		
	}

	@Override
	public String update(int id, EmployeeDto dto) {
		Employee e=this.employee.findById(id).get();
		e.setFirstname(dto.getFirstname());
		e.setLastname(dto.getLastname());
		e.setCity(dto.getCity());
		e.setPassword(dto.getPassword());
		e.setPhone_no(dto.getPhone_no());
		
		this.employee.save(e);
		
		
		return "Updated...";
	}

	@Override
	public String deleteById(int id) {
		Employee e=this.employee.findById(id).get();
		employee.deleteById(id);
		return "Deleted...";
	}

	@Override
	public String deleteAll() {
		employee.deleteAll();
		return "All User has been deleted successfully...";
		
	}

	@Override
	public List<EmployeeDto> getByCity(String city) {
		return employee.findByCity(city).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
		
	}

	@Override
	public List<EmployeeDto> getBySalary(int salary) {
		return employee.findBySalary(salary).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getByFirstnameAndLastname(String firstname, String lastname) {
		return employee.findByFirstnameAndLastname(firstname, lastname).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getByFirstname(String firstname) {
		return employee.findByFirstname(firstname).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}
	
	@Override
	public List<EmployeeDto> getByPincode(int pincode){
		return employee.findByPincode(pincode).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}
	
	@Override
	public List<EmployeeDto> getByLastname(String lastname){
		return employee.findByLastname(lastname).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getByPinCity(int pincode, String city) {
		return employee.findByPinCity(pincode, city).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getByAge(int age) {
		return employee.findByAge(age).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getByFirstnameEmail(String firstname, String email) {
		return employee.findByFirstnameEmail(firstname, email).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> getBylastnameEmail(String lastname, String email) {
		return employee.findByLastnameEmail(lastname, email).stream().map(this::EmployeeToemployeeDto).collect(Collectors.toList());
	}

	
	

	
	
	
	
	
	
	

}
