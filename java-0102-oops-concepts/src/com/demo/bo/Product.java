package com.demo.bo;

public class Product {
	
	String name;
	double price;
	
	public Product() {
		super();
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name :" + name);
		System.out.println("Price :" + price);
	}

}
