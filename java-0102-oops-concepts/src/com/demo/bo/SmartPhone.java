package com.demo.bo;

public class SmartPhone extends Electronics {

	int storageCapacity;	
	String operatingSystem;
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String name, double price, int warrantyPeriod, int storageCapacity, String operatingSystem) {
		super(name, price, warrantyPeriod);
		this.storageCapacity = storageCapacity;
		this.operatingSystem = operatingSystem;
	}
	
	public void displaySmartPhoneDetails() {
		System.out.println("Storage Capacity : " + storageCapacity + " GB");
		System.out.println("Operating System :" + operatingSystem);
	}
	
	
}
