package com.spring.dto;

import com.spring.entity.Address;
import com.spring.entity.Login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDto {

	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String phone_no;
	private String dob;
	private Address address;
	private Login entity;
}
