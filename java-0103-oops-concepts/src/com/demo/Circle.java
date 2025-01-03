package com.demo;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
