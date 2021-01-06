package com.spring.demo.project.Springdemoproject;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import springdemoproject.users.GetUserRequest;
import springdemoproject.users.GetUserResponse;
import springdemoproject.users.UserDetails;

@Endpoint
public class UserDetailsEndpoint {
	
	@PayloadRoot(namespace ="http://springdemoproject/users",localPart ="GetUserRequest")
	@ResponsePayload
	public GetUserResponse processUserDetailsRequest(@RequestPayload GetUserRequest request){
		
		GetUserResponse response= new GetUserResponse();
		UserDetails userDetails=new UserDetails();
		userDetails.setId(request.getId());
		userDetails.setFirstname("Kritartha");
		userDetails.setLastname("Deka");
		response.setUserDetails(userDetails);
		return response;
	}

}
