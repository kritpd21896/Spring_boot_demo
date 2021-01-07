package com.spring.demo.project.Springdemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.demo.project.Springdemoproject.bean.User;
import com.spring.demo.project.Springdemoproject.service.UserDetailsService;

import springdemoproject.users.GetUserRequest;
import springdemoproject.users.GetUserResponse;
import springdemoproject.users.UserDetails;

@Endpoint
public class UserDetailsEndpoint {
	
	@Autowired
	UserDetailsService service;
	
	
	@PayloadRoot(namespace ="http://springdemoproject/users",localPart ="GetUserRequest")
	@ResponsePayload
	public GetUserResponse processUserDetailsRequest(@RequestPayload GetUserRequest request){
		
		GetUserResponse response= new GetUserResponse();
		
		User user=service.findUserById(request.getId());
		
		UserDetails userDetails=new UserDetails();
		userDetails.setId(user.getId());
		userDetails.setFirstname(user.getFirstname());
		userDetails.setLastname(user.getLastname());
		userDetails.setPersonalAddress(user.getPersonalAddress());
		userDetails.setTaxId(user.getTaxId());
		userDetails.setPassportNumber(user.getPassportNumber());
		userDetails.setDlNumber(user.getDlNumber());
		response.setUserDetails(userDetails);
		return response;
	}

}
