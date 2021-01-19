package com.spring.demo.project.Springdemoproject.entity.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity{

	
	
	@Id
	@GeneratedValue
	private int user_id;
	private String first_name;
	private String last_name;
	private String personal_address;
	private int tax_id;
	private int passport_number;
	private int dl_number;
	
	public UserEntity() {
		
	}
	
	
	public UserEntity(int role_id, String first_name, String last_name, String personal_address, int tax_id,
			int passport_number, int dl_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.personal_address = personal_address;
		this.tax_id = tax_id;
		this.passport_number = passport_number;
		this.dl_number = dl_number;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPersonal_address() {
		return personal_address;
	}
	public void setPersonal_address(String personal_address) {
		this.personal_address = personal_address;
	}
	public int getTax_id() {
		return tax_id;
	}
	public void setTax_id(int tax_id) {
		this.tax_id = tax_id;
	}
	public int getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(int passport_number) {
		this.passport_number = passport_number;
	}
	public int getDl_number() {
		return dl_number;
	}
	public void setDl_number(int dl_number) {
		this.dl_number = dl_number;
	}
	
	
}
