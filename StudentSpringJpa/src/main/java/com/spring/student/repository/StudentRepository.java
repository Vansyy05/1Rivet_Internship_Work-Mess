package com.spring.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	public List<StudentEntity> findByName(String name);
	
	public List<StudentEntity> findByAddress(String address);
}
