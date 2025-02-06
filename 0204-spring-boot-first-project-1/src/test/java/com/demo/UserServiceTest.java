package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.User;
import com.demo.services.UserService;

import jakarta.transaction.Transactional;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testCreateUser() {
		
		User user = new User(102L, "Isha2", "isha2@test.com");
		
		User savedUser = userService.createUser(user);
		
		assertNotNull(savedUser);
		assertEquals("Isha", savedUser.getName());
		assertEquals("isha@test.com", savedUser.getEmail());
	}
	
	

}
