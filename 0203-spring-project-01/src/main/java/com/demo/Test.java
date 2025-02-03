package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.services.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceImpl empServiceImpl1 = context.getBean(EmployeeServiceImpl.class);
		
		EmployeeServiceImpl empServiceImpl2 = context.getBean(EmployeeServiceImpl.class);

		EmployeeServiceImpl empServiceImpl3 = context.getBean(EmployeeServiceImpl.class);

	}

}
