package com.spring.demo.project.Springdemoproject.entity.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	UserRepository repository;
	
	
	public UserDAOService(UserRepository repository) {
		super();
		this.repository = repository;
	}

	public int insert(UserEntity user) {
		entityManager.persist(user);
		return user.getUser_id();
	}
	
	public UserEntity getById(int id) {
		return repository.findById(id).get();
	}
}
