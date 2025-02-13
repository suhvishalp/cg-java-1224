package com.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a new Employee
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Retrieve an Employee by ID
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeOpt = employeeRepository.findById(id);
        return employeeOpt.orElse(null);
    }

    // Update an existing Employee
    public Employee updateEmployee(Long id, Employee employee) {
        // This will update the record if an employee with the given id exists.
    	Employee existingEmployee = getEmployeeById(id);
    	
    	if(existingEmployee!=null) {
    		
    		existingEmployee.setCity(employee.getCity());
    		existingEmployee.setEmail(employee.getEmail());
    		existingEmployee.setName(employee.getName());
    		existingEmployee.setSalary(employee.getSalary());
    		
    		return employeeRepository.save(employee);
    	}
    	
        return null;
    }

    // Delete an Employee by ID
    public void deleteEmployee(Long id) {

    	Employee existingEmployee = getEmployeeById(id);
    	
    	
    	if(existingEmployee!=null) {
    		
    		employeeRepository.delete(existingEmployee);
    	}
    	
    }

    // Retrieve all Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Retrieve employees by city
    public List<Employee> getEmployeesByCity(String city) {
        return employeeRepository.findByCity(city);
    }

    // Retrieve an employee by email
    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
}
