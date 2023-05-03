package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.dto.EmployeeDto;
import com.spring.entity.Employee;

@Repository
public interface EmployeeRepositroy extends JpaRepository<Employee, Integer> {
	
	@Query(value="SELECT e from Employee WHERE e.lastname= ?", nativeQuery = true)
	public List<Employee> findByLastname(String lastname);
	
	@Query(value="SELECT * FROM employee_detail WHERE firstname= ?", nativeQuery = true)
	public List<Employee> findByFirstname(String firstname);
	
	@Query(value="SELECT * FROM employee_detail WHERE city=?", nativeQuery=true)
	public List<Employee> findByCity(String city);
	
	@Query(value="SELECT * FROM employee_detail WHERE salary=?", nativeQuery = true)
	public List<Employee> findBySalary(int salary);
	
	@Query(value="SELECT * FROM employee_detail WHERE firstname=? and lastname=?",nativeQuery = true)
	public List<Employee> findByFirstnameAndLastname(String firstname, String lastname);
	
	@Query(value="SELECT * FROM employee_detail WHERE pincode=?",nativeQuery = true)
	public List<Employee> findByPincode(int pincode);
	
	@Query(value="SELECT * FROM employee_detail WHERE city=? and pincode=?",nativeQuery = true)
	public List<Employee> findByPinCity(int pincode,String city);
	
	@Query(value="SELECT * FROM employee_detail WHERE age=?",nativeQuery = true)
	public List<Employee> findByAge(int age);
	
	@Query(value="SELECT * FROM employee_detail WHERE firstname=? and email=?", nativeQuery = true)
	public List<Employee> findByFirstnameEmail(String firstname,String email);
	
	@Query(value="SELECT * FROM employee_detail WHERE lastname=? and email=?", nativeQuery = true)
	public List<Employee> findByLastnameEmail(String lastname,String email);
	
	
	
}
