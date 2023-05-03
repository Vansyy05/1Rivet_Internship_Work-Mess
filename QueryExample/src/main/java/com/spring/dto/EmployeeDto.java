package com.spring.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
		
		private int id;
		@Size(min=2,max=15,message="Sorry")
		private String firstname;
		@Size(min=2,max=30,message="Sorry invalid...")
		private String lastname;
		@NotNull(message="required..")
		private int age;
		@NotNull(message = "required..")
		private String city;
		@Min(value=6)
		private int pincode;
		@Pattern(regexp="^[a-zA-Z0-9]{6,10}$")
		private String password;
		@Min(value=10)
		private long phone_no;
		@Email
		private String email;
		
		
		}
	



