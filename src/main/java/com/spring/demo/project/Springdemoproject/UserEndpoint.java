package com.spring.demo.project.Springdemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.demo.project.Springdemoproject.entity.user.UserDAOService;
import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;


import springdemoproject.users.GetUserRequest;
import springdemoproject.users.GetUserResponse;
import springdemoproject.users.UserDetails;

@Endpoint
public class UserEndpoint {
	
	public UserDAOService service;
	
	

	@Autowired
	public UserEndpoint(UserDAOService service) {
//		super();
		this.service = service;
	}




	@PayloadRoot(namespace = "http://springdemoproject/users", localPart ="GetUserRequest")
	@ResponsePayload
	public GetUserResponse getUserDetails(@RequestPayload GetUserRequest request) {
		GetUserResponse response=new GetUserResponse();
		UserEntity entity=this.service.getById(request.getId());
		System.out.println(entity.getFirst_name());
		UserDetails details=new UserDetails();
		details.setId(entity.getUser_id());
		details.setFirstname(entity.getFirst_name());
		details.setLastname(entity.getLast_name());
		details.setDlNumber(entity.getDl_number());
		details.setPassportNumber(entity.getPassport_number());
		details.setPersonalAddress(entity.getPersonal_address());
		details.setTaxId(entity.getTax_id());
		response.setUserDetails(details);
		return response;
	}
	

}
