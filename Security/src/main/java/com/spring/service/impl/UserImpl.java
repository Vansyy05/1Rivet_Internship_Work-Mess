package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.repo.UserRepo;
import com.spring.service.UserService;

@Service
public class UserImpl implements UserService {

	@Autowired
	private UserRepo repository;
	
	@Override
	public String insert(User u) {
	User user=repository.save(u);
		return "Inserted....";
	}

	@Override
	public List<User> viewall() {
		return repository.findAll();
	}

}
