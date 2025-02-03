package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.demo.dao.EmployeeDAOImpl;

@Component
@Scope("prototype")
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDAOImpl empDao;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl object is created, no-arg constructor");
	}

	public EmployeeServiceImpl(EmployeeDAOImpl empDao) {
		this.empDao = empDao;
		System.out.println("EmployeeServiceImpl object is created, parameterized constructor");
	}

	public EmployeeDAOImpl getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDAOImpl empDao) {
		this.empDao = empDao;
	}
	
	
}
