package com.demo;

import java.util.Date;

import com.demo.bo.Employee;
import com.demo.bo.SmartPhone;

public class UserInterface {
	
	public static void main(String[] args) {
		
//		Employee emp1 = new Employee(101, "Pune", "Isha", "Gawande", new Date());
//		
//		Employee emp2 = new Employee(101, "Pune");
//		
//		Employee emp3 = new Employee();
		
		SmartPhone smartPhone1 = new SmartPhone("Samsung Galaxy S24", 24000.00, 60, 128, "Android");

		smartPhone1.displayProductDetails();
		smartPhone1.displayWarrantyDetails();
		smartPhone1.displaySmartPhoneDetails();

		
	}

}
