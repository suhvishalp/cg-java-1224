package com.demo;

public class CreditCardPayment implements Payment {
	
	//
	//
	//

	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing " + amount + " using credit card");
	}

	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Refunding " + amount+ " using credit card");
	}

}
