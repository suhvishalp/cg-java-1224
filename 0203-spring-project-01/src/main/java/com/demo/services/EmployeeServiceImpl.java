package com.demo.services;

import com.demo.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl {
	
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
