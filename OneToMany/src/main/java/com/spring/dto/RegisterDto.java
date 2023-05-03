package com.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RegisterDto {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private long phone_no;
	private String dob;
	
}
