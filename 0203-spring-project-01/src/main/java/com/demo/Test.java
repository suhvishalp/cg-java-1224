package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.services.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		EmployeeServiceImpl empServiceImpl = context.getBean(EmployeeServiceImpl.class);
		
		//
	}

}
