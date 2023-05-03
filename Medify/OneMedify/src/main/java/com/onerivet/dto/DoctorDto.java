package com.onerivet.dto;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.onerivet.entity.Address;
import com.onerivet.entity.DepartmentEntity;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
	
	private int id;
	private String email;

	private String password;

	private String confirmpassword;
	
	private String firstname;
	
	private String lastname;
	
	private String specialization;
	
	private String mobile_no;
	
	private String institute_name;

	private LocalDate date;
	
	private String gender;

	private Address address;
	
	private DepartmentEntity department;
	
//	@AssertTrue(message = "Password didn't matches... Try Again.")
//	private boolean isPasswordConfirmed() {
//		return password.equals(confirmpassword);
//	}
}
