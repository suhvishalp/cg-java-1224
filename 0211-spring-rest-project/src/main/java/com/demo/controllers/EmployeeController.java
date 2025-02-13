package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	//RESTful api endpoint

	@GetMapping()			//http request type : GET			//url : /api/employees
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")	//GET /api/employees/23
	public Employee getEmployeeById(@PathVariable Long id) {
		
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping()  //POST 	/api/employees
	public Employee createNewEmployee(@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee ) {
		
		return employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "Employee is deleted";
	}
	
}











