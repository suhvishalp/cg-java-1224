package com.demo.bo;

import java.util.Date;

public class Employee extends Person {
	
	private int empId;
	private String city;
	private double salary;
	private String[] projects;
	
	public Employee() {
		System.out.println("Employee no-arg constructor is called");
		this.projects = new String[10];
	}
	
	public Employee(int empId, String city, String firstName, String lastName, Date dob) {
		super(firstName, lastName, dob);
		this.empId = empId;
		this.city = city;
	}
	
	public Employee(int empId,  String city) {
		this.empId = empId;
		this.city = city;
	}

	public Employee(int empId) {
		this.empId = empId;
	}

	public Employee(int empId, String city, double salary) {
		this.empId = empId;
		this.city = city;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		//
		this.empId = empId;
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
	
	
	
}
