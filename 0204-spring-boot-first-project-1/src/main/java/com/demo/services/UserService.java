package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Long id){
	
		Optional<User> optionalUser = 	userRepository.findById(id);
		
		return optionalUser.isPresent() ? optionalUser.get() : null;
		
//		return userRepository.findById(id).orElseThrow();
	}
	
	public User updateUser(Long id, User user) {
		
		User existingUser = getUserById(id);
		
		if(existingUser != null) {
			existingUser.setName(user.getName());
			existingUser.setEmail(user.getEmail());
			userRepository.save(existingUser);
			return existingUser;
		}
		
		return null;
	}
	
	public void deleteUser(Long id) {
		User existingUser = getUserById(id);
		userRepository.delete(existingUser);
	}
	
}
