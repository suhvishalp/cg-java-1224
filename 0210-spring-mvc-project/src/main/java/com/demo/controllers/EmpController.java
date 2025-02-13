package com.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Employee;

@RestController
public class EmpController {

	@GetMapping("/api/employees")
	public List<Employee> getAllEmployees(){
		
		return null;
	}
}
