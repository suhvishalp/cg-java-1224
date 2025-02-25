package com.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

//@Configuration
public class DataSeeder {

    @Bean
    public CommandLineRunner seedData(EmployeeRepository employeeRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Check if the repository is empty to avoid duplicates on every restart
            if (employeeRepository.count() == 0) {
                Employee admin = new Employee(
                    "Admin User",
                    "admin@example.com",
                    "New York",
                    new BigDecimal("8000"),
                    passwordEncoder.encode("adminpassword"),  // BCrypt encoded password
                    "ADMIN"
                );
                employeeRepository.save(admin);

                Employee employee = new Employee(
                    "John Doe",
                    "john.doe@example.com",
                    "Los Angeles",
                    new BigDecimal("4000"),
                    passwordEncoder.encode("employeepassword"),  // BCrypt encoded password
                    "EMPLOYEE"
                );
                employeeRepository.save(employee);
            }
        };
    }
}
