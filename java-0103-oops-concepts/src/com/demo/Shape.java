package com.demo;

public abstract class Shape {
	
	protected String name;

	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public abstract double calculateArea();

}
