package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.dto.RegistrationDto;
import com.spring.entity.Registration;

public interface RegisterRepo extends JpaRepository<Registration, Integer> {
	
	public void save(RegistrationDto dto);

}
