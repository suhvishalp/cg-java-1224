package com.demo;

import java.util.Scanner;

public class ShapeUserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Shape shape = null;
		
		System.out.println("Enter a choice: \n\t 1. Rectangle \n\t 2. Circle");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			shape = new Rectangle("Rectangle", 12.33, 4.43);
			break;
			
		case 2:
			shape = new Circle("Circle", 10.54);
			break;
			
		default:	
			System.out.println("Invalid Choice!");
		}
		
		if(shape!=null) {
			System.out.println("Area :" +  shape.calculateArea());
		}

	}

}
