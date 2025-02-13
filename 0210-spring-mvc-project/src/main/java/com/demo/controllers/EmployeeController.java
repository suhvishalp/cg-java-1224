package com.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entities.Employee;

@Controller
public class EmployeeController {

	static List<Employee> empList = new ArrayList<>(
			Arrays.asList(
			
			new Employee(101, "Isha", "Delhi", "isha@test.com", 12000.00),
			new Employee(102, "Janice", "Pune", "janice@test.com", 45000.00),
			new Employee(103, "Samruddhi", "Pune", "samruddhi@test.com",23400.00),
			new Employee(104, "Payal", "Pune", "payal@test.com", 65000.00),
			new Employee(105, "Jagriti", "Nagpur", "jagriti@test.com", 56000.00)
	
		));
	
	
	//REST API Endpoint
	@GetMapping("/api/employees")
	@ResponseBody
	public List<Employee> getAllEmployees(){
		
		return empList;
	}
	
	
	
	
	@GetMapping("/employees")
	public String showAllEmployees(Model model) {
		
		model.addAttribute("empList", empList);
		
		return "employees";
	}
	
	@GetMapping("/employeeform")
	public String showEmployeeForm(Model model) {
		
		model.addAttribute("employee", new Employee());
		
		return "employeeform";
	}
	
	@PostMapping("/employees/add")
	public String addNewEmployee(@ModelAttribute("employee") Employee employee) {
		
		System.out.println("Employee data received " + employee.getCity() + " " + employee.getName());
		//save this employee object into the db using a service class
		empList.add(employee);
		
		return "redirect:/employees";
	}
	
	
}
