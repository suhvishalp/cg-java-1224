package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utils.DBUtil;

public class EmployeeDAO {
	
	public int addEmployee(Employee employee) {
		
		try(Connection connection = DBUtil.getConnection()){
			
			//code / logic to insert an employee record into the db 
			
			String inserQuery = "INSERT INTO employee values(?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(inserQuery);
			
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getCity());
			ps.setInt(4, employee.getSalary());
			
			int rows = ps.executeUpdate();
			
			return rows;
			
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

	public int updateEmployee(Employee employee) {
	
		try(Connection connection = DBUtil.getConnection()){
			String inserQuery = "UPDATE employee SET name=?, city=?, salary=? WHERE empid=?";
			
			PreparedStatement ps = connection.prepareStatement(inserQuery);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getCity());
			ps.setInt(3, employee.getSalary());
			ps.setInt(4, employee.getEmpId());
			
			int rows = ps.executeUpdate();
			
			return rows;
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
		return 0;
		
	}
	
}
