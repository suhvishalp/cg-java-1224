package com.demo;

public class PaymentSystemUserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment creditCard = new CreditCardPayment();
		
		Payment upi = new UPIPayment();
		
		creditCard.processPayment(1000.00);
		
		upi.processPayment(2000.00);

	}

}
