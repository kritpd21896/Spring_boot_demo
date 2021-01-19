package com.spring.demo.project.Springdemoproject.entity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
		userRepository.save(user1);
		userRepository.save(user2);
		
	
		
	}
	
	
}
