package com.demo.bo;

public class Electronics extends Product {

	int warrantyPeriod;

	public Electronics() {
		super();
	}

	public Electronics(String name, double price, int warrantyPeriod) {
		super(name, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	public void displayWarrantyDetails() {
		System.out.println("Warranty Period " + warrantyPeriod + " Months");
	}
	 
	
	
}
