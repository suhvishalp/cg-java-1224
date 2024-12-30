package java_1227_arrays;

public class Employee {
	
	private int id;			//instance variables
	private String name;
	private String city;
	private double salary;
	
	public static String companyName;
	public static int count;
	
	static void showCompanyName() {
		//used to access static variables
		System.out.println("Company Name " + companyName);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
