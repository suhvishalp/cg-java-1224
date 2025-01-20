import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		// Adding employees with varying details including email
		employees.add(new Employee(1, "Alice", "New York", "IT", 75000, "alice@outlook.com"));
		employees.add(new Employee(2, "Bob", "San Francisco", "Finance", 85000, "bob@example.com"));
		employees.add(new Employee(3, "Anita", "Chicago", "HR", 65000, "charlie@outlook.com"));
		employees.add(new Employee(4, "David", "Seattle", "IT", 90000, "david@example.com"));
		employees.add(new Employee(5, "Aditi", "Austin", "Marketing", 72000, "eve@gmail.com"));
		employees.add(new Employee(6, "Dhanashri", "Boston", "Finance", 80000, "frank@example.com"));
		employees.add(new Employee(7, "Babita", "New York", "Sales", 78000, "grace@gmail.com"));
		employees.add(new Employee(8, "Divya", "San Francisco", "IT", 95000, "hank@example.com"));
		employees.add(new Employee(9, "Bobby", "Chicago", "HR", 67000, "ivy@example.com"));
		employees.add(new Employee(10, "Jack", "Austin", "Sales", 76000, "jack@outlook.com"));

//        List<String> emailIds =	employees
//					        	.stream()
//					        	.map(employee -> employee.getEmail())
//					        	.collect(Collectors.tom);
//        
//        emailIds.forEach(System.out::println);

//        Map<Integer, Employee> map = employees
//        								.stream()
//        								.collect(Collectors.toMap(Employee::getEmpId, employee -> employee));
//        
//        for(Map.Entry<Integer, Employee> entry: map.entrySet()) {
//        	System.out.println("key :" + entry.getKey() + " value :" + entry.getValue());
//        }

//        Map<String, Long> map = employees
//        								.stream()
//        								.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        
//        for(Map.Entry<String, Long> entry: map.entrySet()) {
//        	System.out.println("key :" + entry.getKey() + " value :" + entry.getValue());
//        }

//		Map<String, List<Employee>> map = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment));
//
//		for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + "\n" + entry.getValue());
//		}
		
		
		//departname : averagesalary
		
//		Map<String, Double> map = employees
//				.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
//						Collectors.averagingDouble(Employee::getSalary)));
//
//		for (Map.Entry<String, Double> entry : map.entrySet()) {
//			System.out.println("Department Name :" + entry.getKey() + " \tAverage Salary :" + entry.getValue());
//		}
		
//		
//		Map<Character, List<String>> map = employees
//			.stream()				//e1 e2 e3 ...
//			.map(employee -> employee.getName())		//n1 n2 n3 
//			.collect(Collectors.groupingBy(name -> name.charAt(0)));
//			
//		for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
//			System.out.println( (char) entry.getKey() + " \t Names :" + entry.getValue());
//		}
		
		 
		
//		Optional<Employee> optEmployee = employees
//											.stream()
//											.collect(Collectors.maxBy((e1, e2)-> Double.compare(e1.getSalary(), e2.getSalary())));
//		
//		if(optEmployee.isPresent())
//			System.out.println(optEmployee.get());
		
		
//		Map<String, Optional<Employee>> map = employees
//			.stream()
//			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//
//		for (Map.Entry<String, Optional<Employee>> entry : map.entrySet()) {
//			System.out.println(( entry.getKey() + " \t :" + entry.getValue().get()));
//		}
		
		Map<Boolean, List<Employee>> map = employees
			.stream()
			.collect(Collectors.partitioningBy(employee -> employee.getSalary() >= 75000));
		
		for (Map.Entry<Boolean, List<Employee>> entry : map.entrySet()) {
			System.out.println((entry.getKey() + " \t :" + entry.getValue()));
		}
	}

}
