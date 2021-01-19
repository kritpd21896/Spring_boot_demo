package com.spring.demo.project.Springdemoproject;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.demo.project.Springdemoproject.entity.user.UserEntity;
import com.spring.demo.project.Springdemoproject.service.user.UserEntityService;

import springdemoproject.users.GetUserRequest;
import springdemoproject.users.GetUserResponse;
import springdemoproject.users.UserDetails;

@Endpoint
public class UserEndpoint {
	
	public UserEntityService service;
	
	public UserEndpoint() {}

	@Autowired
	public UserEndpoint(UserEntityService service) {
		
		this.service = service;
	}
	
	@PayloadRoot(namespace = "http://springdemoproject/users", localPart = "getUserRequest")
	@ResponsePayload
	public GetUserResponse getUserDetails(@RequestPayload GetUserRequest request) {
		GetUserResponse response=new GetUserResponse();
		UserEntity entity=service.getUserById(request.getId());
		UserDetails details=new UserDetails();
		BeanUtils.copyProperties(entity, details);
		response.setUserDetails(details);
		return response;
	}
	

}
