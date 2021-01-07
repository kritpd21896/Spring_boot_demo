package com.spring.demo.project.Springdemoproject.bean;

public class User {
	int id;
	String firstname;
	String lastname;
	String personalAddress;
	int taxId;
	String passportNumber;
	String dlNumber;
	
	public User(int id, String firstname, String lastname, String personalAddress, int taxId, String passportNumber,
			String dlNumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.personalAddress = personalAddress;
		this.taxId = taxId;
		this.passportNumber = passportNumber;
		this.dlNumber = dlNumber;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", personalAddress="
				+ personalAddress + ", taxId=" + taxId + ", passportNumber=" + passportNumber + ", dlNumber=" + dlNumber
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPersonalAddress() {
		return personalAddress;
	}
	public void setPersonalAddress(String personalAddress) {
		this.personalAddress = personalAddress;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	
}
