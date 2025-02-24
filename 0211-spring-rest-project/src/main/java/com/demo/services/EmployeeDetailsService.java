package com.demo.services;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

@Service
public class EmployeeDetailsService implements UserDetailsService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Employee emp = employeeRepository.findByEmail(username);
		
		if(emp == null)
			throw new UsernameNotFoundException("The Employee with the given Email: " + username + " is not valid!");
		
		return new User(emp.getEmail(), emp.getPassword(), 
				Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + emp.getRole()))
		
				);
	}

}
