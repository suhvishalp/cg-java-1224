package com.demo.entities;

public class Employee {
	
	private int id;
	private String name;
	private String city;
	private String email;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String city, String email, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}

	public Employee(int id, String name, String city, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	
	

}
