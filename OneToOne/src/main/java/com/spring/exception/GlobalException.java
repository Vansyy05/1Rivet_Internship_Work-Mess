package com.spring.exception;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException extends RuntimeException {

	@ExceptionHandler(ResourceNotFound.class)
	public Api resourceNotFoundHandler(ResourceNotFound exception) {
		String message=exception.getMessage();
		LocalDateTime now = LocalDateTime.now();
		Api api_response=new Api(message,now);
		return api_response;
	}
	
}
