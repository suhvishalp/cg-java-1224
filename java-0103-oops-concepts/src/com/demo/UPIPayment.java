package com.demo;

public class UPIPayment implements Payment {

	
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing " + amount + " through UPI");
	}

	
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Refunding " + amount + " through UPI");

	}

	
}
