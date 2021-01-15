package com.spring.demo.project.Springdemoproject.service.roles;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;
import com.spring.demo.project.Springdemoproject.repository.role.UserEntityRepository;

public class UserEntityServiceImpl implements UserEntityService {

	public UserEntityRepository userRepository;
	public RolesEntityService rolesRepository;
	
	public UserEntityServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Autowired
	public UserEntityServiceImpl(UserEntityRepository userRepository, RolesEntityService rolesRepository) {
		this.userRepository = userRepository;
		this.rolesRepository = rolesRepository;
	}




	@Override
	public UserEntity getUserById(Integer id, Integer role_id) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
