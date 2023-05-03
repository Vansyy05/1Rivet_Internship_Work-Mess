package com.onerivet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.dto.DoctorDto;
import com.onerivet.service.DoctorService;
import jakarta.validation.Valid;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/insert")
	public String insert(@RequestBody DoctorDto dto) {
		return doctorservice.insert(dto);
	}
	
	@GetMapping("/viewall")
	public List<DoctorDto> viewall() {
	return doctorservice.viewall();
	}
}
