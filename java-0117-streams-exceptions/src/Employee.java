public class Employee {

    private int empId;
    private String name;
    private String city;
    private String department;
    private double salary;
    private String email;

    public Employee() {
        super();
    }

    public Employee(int empId, String name, String city, String department, double salary, String email) {
        super();
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.department = department;
        this.salary = salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n [empId=" + empId + ", name=" + name + ", city=" + city + ", department=" + department
                + ", salary=" + salary + ", email=" + email + "]";
    }
}