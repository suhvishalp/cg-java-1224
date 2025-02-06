package com.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	//Employee save(Employee entity)
	//Optional<Employee> findById(Integer id);
	//Iterable<Employee> findAll();
	//long count();
	//void deleteById(Integer id);
	
}

//*IMP: you don't need to create implementation class of this interface '
//Spring Data Jpa provides a proxy instance 