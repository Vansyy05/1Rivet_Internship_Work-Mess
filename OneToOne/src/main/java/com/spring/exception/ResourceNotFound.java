package com.spring.exception;

import jakarta.annotation.Resource;

public class ResourceNotFound extends RuntimeException{

	public ResourceNotFound(String message) {
		super(message);
	}
}
