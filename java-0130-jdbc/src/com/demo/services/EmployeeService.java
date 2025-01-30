package com.demo.services;

import java.util.List;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public int addEmployee(Employee employee) {
		//service logic 
		int result =  employeeDAO.addEmployee(employee);
		
		if(result > 0) {
			//send an email
		}
			
		return result;
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee>  list = employeeDAO.getAllEmployees();
		
		//sort the list by employee name
		
		return list;
	}
	
	public Employee getEmployeeById(int id) {
		
		return employeeDAO.getEmployeeById(id);
	}

}
