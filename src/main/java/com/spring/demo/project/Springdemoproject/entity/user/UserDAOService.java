package com.spring.demo.project.Springdemoproject.entity.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public int insert(UserEntity user) {
		entityManager.persist(user);
		return user.getUser_id();
	}
	
}
