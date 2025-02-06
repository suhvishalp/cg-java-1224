package com.demo.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EmployeeDAOImpl implements InitializingBean, DisposableBean {
	
	private String dbUrl;
	private String username;
	private String password;

	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAO object is created, no-arg constructor");
	}
	
	
//	public void myOwnInitMethod() {
//		//logic to validate the initialzation, 
//		//have some custom initialization
//		System.out.println("this is my own init method()");
//	}

	public EmployeeDAOImpl(String dbUrl, String username, String password) {
		super();
		this.dbUrl = dbUrl;
		this.username = username;
		this.password = password;
		System.out.println("EmployeeDAO object is created, parameterized constructor");
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
		System.out.println("setting dbUrl using setter method");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("setting username using setter method");

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setting password using setter method");

	}


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is my custom initiatlization method");
	}


	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
