package com.spring.demo.project.Springdemoproject.service.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;
import com.spring.demo.project.Springdemoproject.entity.user.UserRepository;

@Service
@Transactional
public class UserEntityServiceImpl implements UserEntityService{

	private UserRepository repository;
	
	public UserEntityServiceImpl() {
		
	}
	
	@Autowired
	public UserEntityServiceImpl(UserRepository repository) {
		
		this.repository = repository;
	}

	@Override
	public UserEntity getUserById(int id) {
		
		System.out.println(repository.findById(id).get().getFirst_name());
		return this.repository.findById(id).get();
		
	}
	

}
