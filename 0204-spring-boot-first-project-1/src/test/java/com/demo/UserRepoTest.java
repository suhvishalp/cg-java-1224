package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Profile;
import com.demo.entities.User;
import com.demo.repositories.UserRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
public class UserRepoTest {
	
	@Autowired
	private UserRepository userRepository;
	
//	@Test
//	@Transactional
//	public void test() {
//		
//		User user = userRepository.findById(1L).orElse(null);
//		
//		System.out.println(user);
//		
//		Profile profile = user.getProfile();
//	}
	
	@Test
	public void testDeleteUser() {
		User user = userRepository.findById(1L).orElse(null);
		userRepository.delete(user);
	}

}
