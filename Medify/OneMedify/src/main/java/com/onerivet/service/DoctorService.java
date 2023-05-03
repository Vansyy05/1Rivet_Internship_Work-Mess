package com.onerivet.service;

import java.util.List;

import com.onerivet.dto.DoctorDto;

public interface DoctorService {

	public String insert(DoctorDto dto);
	
	public List<DoctorDto> viewall();
	
}
