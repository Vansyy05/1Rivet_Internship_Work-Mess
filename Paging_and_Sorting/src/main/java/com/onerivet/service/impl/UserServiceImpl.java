package com.onerivet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.onerivet.entity.User;
import com.onerivet.repository.UserRepository;
import com.onerivet.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public String add(User insert) {
		repository.save(insert);
		return "Inserted...";
	}

	@Override
	public List<User> getAll(int pageSize, int pageNumber,String sortBy) {
		Pageable page=PageRequest.of(0, 5,Sort.by(sortBy));
		Page<User> user=repository.findAll(page);
		return user.getContent();
	}

	@Override
	public List<User> getAll() {
		return repository.findAll();
	}
	
	
	
	

}
