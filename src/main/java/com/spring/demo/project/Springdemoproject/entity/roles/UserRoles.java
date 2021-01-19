package com.spring.demo.project.Springdemoproject.entity.roles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;

@Entity
@Table(name = "Roles")
public class UserRoles {

	@Id
	@GeneratedValue
	private int role_id;
	private String role_name;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity userEntity;
	public UserRoles(String role_name, UserEntity userEntity) {
		super();
		this.role_name = role_name;
		this.userEntity = userEntity;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	
}
