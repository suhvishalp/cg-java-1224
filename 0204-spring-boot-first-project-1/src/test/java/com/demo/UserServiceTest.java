package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;
import com.demo.services.UserService;

import jakarta.transaction.Transactional;

@SpringBootTest
public class UserServiceTest {

	
	
//	@Autowired
//	private UserService userService;

	
//	@Test
//	public void testCreateUser() {
//		
//		User user1 = new User("Janice", "janice@test.com");
//		User user2 = new User("Samruddhi", "samruddhi@gmail.com");
//		User user3 = new User("Payal", "payal@test.com");
//		User user4 = new User("Ishwari", "ishwari@gmail.com");
//		User user5 = new User("Harshita", "harishita@test.com");
//		
//		
//		User savedUser = userService.createUser(user1);
//		userService.createUser(user2);
//		userService.createUser(user3);
//		userService.createUser(user4);
//		userService.createUser(user5);
//		
//		assertNotNull(savedUser);
//		assertEquals("Janice", savedUser.getName());
//		assertEquals("janice@test.com", savedUser.getEmail());
//	}
	
//	@Test
//	public void testGetUserByEmail() {
//		
//		User user = userService.getUserByEmail("janice@test.com");
//		
//		assertNotNull(user);
//		assertEquals("janice@test.com", user.getEmail());
//	}
//	

}
