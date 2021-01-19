package com.spring.demo.project.Springdemoproject.entity.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.demo.project.Springdemoproject.entity.roles.UserRoles;

//import com.sun.org.slf4j.internal.Logger;



@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
//	private static final Logger log=org.slf4j.LoggerFactory.getLogger(User)

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		UserEntity user1=new UserEntity(0, "Kritartha","Deka","Assam",12345,12364,78945);
		UserEntity user2=new UserEntity(0, "Ankur","Sharma","UP",12845,13369,88945);
		UserRoles role1=new UserRoles("VIEW_PAYMENTS", user1);
		UserRoles role2=new UserRoles("VIEW_CHANGES", user1);
		UserRoles role3=new UserRoles("CHANGE_PAYMENTS", user2);
		List<UserRoles> roles1=Arrays.asList(role1,role2);
		List<UserRoles> roles2=Arrays.asList(role3);
		user1.setRoles(roles1);
		user2.setRoles(roles2);
		userRepository.save(user1);
		userRepository.save(user2);
		
	
		
	}
	
	
}
