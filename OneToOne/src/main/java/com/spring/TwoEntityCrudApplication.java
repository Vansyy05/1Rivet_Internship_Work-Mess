package com.spring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TwoEntityCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoEntityCrudApplication.class, args);
	}

	@Bean
	public ModelMapper modelmapper(){
		return new ModelMapper();
	}
}
