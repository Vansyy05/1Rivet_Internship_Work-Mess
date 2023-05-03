package com.onerivet.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.onerivet.entity.User;

public interface UserService {

	public String add(User insert);
	
	public List<User> getAll(int pageSize, int pageNumber,String sortBy);
	
	public List<User> getAll();
}
