package com.spring.service;

import java.util.List;
import com.spring.dto.RegistrationDto;
import com.spring.entity.Registration;

public interface RegisterService {

	public String insert(RegistrationDto dto);
	
	public List<RegistrationDto> viewall();
	
	public RegistrationDto getbyid(int id);
	
	public String deleteById(int id);
	
	public String deleteAll();
	
	public void update(RegistrationDto dto,int id);
	
	

}
