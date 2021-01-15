package com.spring.demo.project.Springdemoproject.service.roles;

import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;

public interface UserEntityService {

	public UserEntity getUserById(Integer id, Integer role_id);
}
