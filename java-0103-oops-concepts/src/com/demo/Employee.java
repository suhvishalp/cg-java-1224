package com.demo;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String name;
	private String city;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String name, String city, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//overriding the toString() inherited from object class 
	public String toString() {
		return empId + " " + name;
	}

	
	
	//override the equals() method of the object class 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name);
	}
	
	


}
