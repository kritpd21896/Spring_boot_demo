package com.spring.demo.project.Springdemoproject.entity.roles;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class RolesEntity implements Serializable{

	private static final long serialVersionUID=1L;	
	
	@Id
	@GeneratedValue
	private int role_id;
	private String role_name;
	private String role_description;
	
	
	public RolesEntity() {
		
	}
	
	public RolesEntity(String role_name, String role_description) {
		super();
		this.role_name = role_name;
		this.role_description = role_description;
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
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	
	
}
