package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Register;

public interface RegisterRepositroy extends JpaRepository<Register, Integer> {

}
