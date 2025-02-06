package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		EmployeeRepository empRepo =  context.getBean(EmployeeRepository.class);
		
		Employee employee = new Employee(101, "isha", "delhi", 43000.00);
		empRepo.save(employee);
	}

}
