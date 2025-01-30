package com.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utils.DBUtil;

public class EmployeeDAO {
	
	public int addEmployee(Employee employee) {
		
		try(Connection connection = DBUtil.getConnection()){
			
			//code / logic to insert an employee record into the db 
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
	
		return 0; //	1 or 0;
	}
	
	public Employee getEmployeeById(int id) {
		
		//logic to find the employee by given id
		
		return null;
	}
	
	public List<Employee> getAllEmployees() {
		
		return null;
	}

}
