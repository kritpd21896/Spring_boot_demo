package com.spring.demo.project.Springdemoproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.demo.project.Springdemoproject.bean.User;

@Component
public class UserDetailsService {

	private static List<User> users=new ArrayList<>();
	
	static {
		User user1=new User(1,"Kritartha","Deka","Assam,India",31559,"U5243D2","AS1455628");
		users.add(user1);
		User user2=new User(2,"Darpan","Puri","Delhi,India",117596,"U5256D2","DH1455628");
		users.add(user2);
		User user3=new User(3,"Ankur","Sharma","UP,India",71557,"U5243C6","UP1455628");
		users.add(user3);
		User user4=new User(4,"Hema","Sinha","Kerela,India",414459,"U524992","KK55628");
		users.add(user4);
	}
	
	public User findUserById(int id){
		for(User user:users) {
			if(user.getId()==id)
				return user;
		}
		return null;
	}

}
