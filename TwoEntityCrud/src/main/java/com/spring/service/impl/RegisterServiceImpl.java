package com.spring.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.RegistrationDto;
import com.spring.entity.Registration;
import com.spring.repository.RegisterRepo;
import com.spring.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	public ModelMapper modelmapper;
	
	@Autowired
	public RegisterRepo repository;
	
	private Registration RegistrationDtoToRegistration(RegistrationDto dto) {
		Registration entity=this.modelmapper.map(dto,Registration.class);
				return entity;
	}
	
	private RegistrationDto RegistrationToRegistrationDto(Registration entity) {
		RegistrationDto dto=this.modelmapper.map(entity,RegistrationDto.class);
				return dto;
	}

	@Override
	public String insert(RegistrationDto dto) {
		repository.save(this.RegistrationDtoToRegistration(dto));
		return "Record Inserted Successfully...";
	}

	@Override
	public List<RegistrationDto> viewall() {
		List <Registration> register=repository.findAll();
		List<RegistrationDto> dto=repository.findAll().stream().map(this::RegistrationToRegistrationDto).collect(Collectors.toList());
		return dto;
	}

	@Override
	public RegistrationDto getbyid(int id) {
		Registration register=this.repository.findById(id).get();
		return this.RegistrationToRegistrationDto(register);
	}

	@Override
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Deleted...";
	}

	@Override
	public String deleteAll() {
		repository.deleteAll();
		return "All User deleted successfully...";
	}

	@Override
	public void update(RegistrationDto dto,int id) {
		repository.save(dto);
	}

	
	
	
	
	
	
	
}
