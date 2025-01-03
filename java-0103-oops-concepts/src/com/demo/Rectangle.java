package com.demo;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}
