package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entities.Profile;
import com.demo.entities.User;
import com.demo.repositories.ProfileRepository;
import com.demo.repositories.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		ApplicationContext context =  SpringApplication.run(Application.class, args);
	
	
		UserRepository userRepo =  context.getBean(UserRepository.class);
		ProfileRepository profileRepo = context.getBean(ProfileRepository.class);
	
//		Profile profile = new Profile();
//		profile.setBio("This is bio for user 2");
//		
////		profileRepo.save(profile);
//		
//		
//	
//		User user = new User("Janice", "janice@test.com");
//		user.setProfile(profile);
//		userRepo.save(user);
		
		
//		User user =  userRepo.findById(1L).orElse(null);
//		
//		Profile profile = user.getProfile();
	}

}
