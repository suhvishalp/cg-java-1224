package com.demo.bo;

public class MathOperations {

	
	public static void arithAdd(int a, int b) {
		System.out.println("This is method 1");
		int sum = a + b;
		System.out.println("sum : "+ sum);
	}
	
	public static void arithAdd(int a, long b) {
		System.out.println("This is method 2");
		long sum = a + b;
		System.out.println("sum : "+ sum);
	}
	
	public static void arithAdd(long a, int b) {
		System.out.println("This is method 3");
		long sum = a + b;
		System.out.println("sum : "+ sum);
	}
	
	public static void arithAdd(byte a, int b) {
		System.out.println("This is method 4");
		long sum = a + b;
		System.out.println("sum : "+ sum);
	}
	
}
