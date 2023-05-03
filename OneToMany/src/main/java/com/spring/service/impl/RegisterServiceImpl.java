package com.spring.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.dto.RegisterDto;
import com.spring.entity.Register;
import com.spring.repository.RegisterRepositroy;
import com.spring.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RegisterRepositroy repository;
	
	private Register RegisterDtoToRegister(RegisterDto dto) {
		Register entity=this.modelMapper.map(dto, Register.class);
		return entity;
	}
	
	private RegisterDto RegisterToRegisterDto(Register entity) {
		RegisterDto dto=this.modelMapper.map(entity,RegisterDto.class);
		return dto;
	}
	
	@Override
	public String insert(RegisterDto dto) {
		Register registration=RegisterDtoToRegister(dto);
		repository.save(registration);
		return "Record Inserted Successfully...";
	}
		
	

	
	
	
}
