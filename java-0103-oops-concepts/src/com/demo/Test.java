package com.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee(101, "Harika", "Solapur", 3400.00);
		
		Employee employee2 = new Employee(102, "Harika", "Solapur", 3400.00);;
		
//		System.out.println(employee.getClass().getName());
		
		System.out.println(employee1.toString());
		
		System.out.println(employee1);
		
		System.out.println(employee1.equals(employee2));
		
		
		if(employee1.equals(employee2))
			System.out.println("both employees are same");
		else 
			System.out.println("both are different");
		
		employee1.equals(employee1);
		
		employee1.equals(null);
	}

}
