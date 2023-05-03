package com.onerivet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.dto.DoctorDto;
import com.onerivet.entity.DoctorEntity;
import com.onerivet.repository.DoctorRepository;
import com.onerivet.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctor;
	
	@Autowired
	private ModelMapper modelmapper;
	
	private DoctorEntity doctorDtoToDoctor(DoctorDto dto) {
		DoctorEntity doctor=this.modelmapper.map(dto,DoctorEntity.class);
		return doctor;
	}
	
	private DoctorDto DoctorTodoctorDto(DoctorEntity doctor) {
		DoctorDto dto=this.modelmapper.map(doctor, DoctorDto.class);
		return dto;
	}

	@Override
	public String insert(DoctorDto dto) {
		doctor.save(this.doctorDtoToDoctor(dto));
		return "Inserted...";
	}

	@Override
	public List<DoctorDto> viewall() {
		List<DoctorEntity> d=doctor.findAll();
		List<DoctorDto> doctordto=doctor.findAll().stream().map(this::DoctorTodoctorDto).collect(Collectors.toList());
		return doctordto;
		
	}
	
	
	
}
