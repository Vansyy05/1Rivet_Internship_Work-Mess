package com.spring.student.studentservice.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.student.entity.StudentEntity;
import com.spring.student.repository.StudentRepository;
import com.spring.student.studentservice.StudnetService;

@Service
public class StudentServiveImpl implements StudnetService {

	@Autowired
	private StudentRepository studentrepo;
	
	
	
	@Override
	public String insert(StudentEntity s) {
		studentrepo.save(s);
		return "Data Inserted...";
	}

	@Override
	public List<StudentEntity> viewall() {
		return studentrepo.findAll();
	}

	@Override
	public Optional<StudentEntity> getById(int id) {
		return studentrepo.findById(id);
}

	@Override
	public String deleteById(int id) {
		studentrepo.deleteById(id);
		return "Deleted...";
	}

	@Override
	public String deleteAll() {
		studentrepo.deleteAll();
		return "All User Deleted Successfully...";
	}

	@Override
	public StudentEntity update(int id, StudentEntity s) {
		studentrepo.findById(id);
		studentrepo.save(s);
		return s;
	}

	@Override
	public List<StudentEntity> getByName(String name) {
		
		return studentrepo.findByName(name);
	}

	@Override
	public List<StudentEntity> getByAddress(String address) {
		return studentrepo.findByAddress(address);
	}
	
	
}

