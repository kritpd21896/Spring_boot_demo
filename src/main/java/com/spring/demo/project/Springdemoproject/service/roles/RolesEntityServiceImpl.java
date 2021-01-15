package com.spring.demo.project.Springdemoproject.service.roles;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.project.Springdemoproject.entity.roles.RolesEntity;
import com.spring.demo.project.Springdemoproject.repository.role.RolesEntityRepository;

@Service
@Transactional
public class RolesEntityServiceImpl implements RolesEntityService {

	private RolesEntityRepository rolesRepository;
	
	public RolesEntityServiceImpl() {
		
	}
	
	@Autowired
	public RolesEntityServiceImpl(RolesEntityRepository rolesRepository) {
		this.rolesRepository=rolesRepository;
	}

	@Override
	public RolesEntity getEntityById(Integer id) {
		// TODO Auto-generated method stub
		return this.rolesRepository.findById(id).get();
	}
	
	
}
