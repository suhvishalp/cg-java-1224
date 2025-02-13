package com.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Retrieve employees from a specific city.
    List<Employee> findByCity(String city);

    // Retrieve an employee by email.
    Employee findByEmail(String email);
    
    
}
