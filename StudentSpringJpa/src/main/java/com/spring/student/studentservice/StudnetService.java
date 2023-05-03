package com.spring.student.studentservice;

import java.util.List;
import java.util.Optional;

import com.spring.student.entity.StudentEntity;

public interface StudnetService {

	public String insert(StudentEntity s);
	
	public List<StudentEntity> viewall();
	
	public Optional<StudentEntity> getById(int id);
	
	public String deleteById(int id);
	
	public String deleteAll();
	
	public StudentEntity update(int id,StudentEntity s);
	
	public List<StudentEntity> getByName(String name);
	
	public List<StudentEntity> getByAddress(String address);
}
