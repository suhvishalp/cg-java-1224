import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;
	private String name;
	private String city;
	private double salary;
	private String email;
	
	public Employee() {
		super();
	}

	

	public Employee(int empId, String name, String city, double salary, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.email = email;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
}
