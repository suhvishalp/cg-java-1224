package java_1227_arrays;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter some number: ");
		int number = scanner.nextInt();
	
		scanner.nextLine();
				
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		
		
		System.out.println("Number :" + number);
		System.out.println("Name :" + name);
		
		scanner.close();

	}

}