package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.dao.EmployeeDAOImpl;
import com.demo.services.EmployeeServiceImpl;

@Configuration
@ComponentScan
public class ApplicationConfig {
	
//	@Bean
//	@Scope("prototype")
//	public EmployeeDAOImpl createEmployeeDAOImpl() {
//		//logic to create an object
//		//..
//		EmployeeDAOImpl empDao =  new EmployeeDAOImpl();
//		empDao.myOwnInitMethod();
//	}
//	
//	@Bean
//	public EmployeeServiceImpl createEmployeeServiceImpl(EmployeeDAOImpl empDao) {
//		
//		return new EmployeeServiceImpl(empDao);
//	
//	}
}
