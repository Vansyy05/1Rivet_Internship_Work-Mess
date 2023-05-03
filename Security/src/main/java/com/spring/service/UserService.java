package com.spring.service;

import java.util.List;

import com.spring.entity.User;

public interface UserService {

	public String insert(User u);
	
	public List<User> viewall();
}
