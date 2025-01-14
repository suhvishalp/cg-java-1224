import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Employee> employeeMap = new HashMap<>();
		
		employeeMap.put(101, new Employee(101, "Isha", "Pune", 20000.00, "CFMG"));
		employeeMap.put(102, new Employee(102, "Jagruti", "Hyderabad", 70000.00, "CCNA"));
		employeeMap.put(103, new Employee(103, "Samruddhi", "Pune", 56000.00, "FS"));
		employeeMap.put(104, new Employee(104, "Payal", "Hyderabad", 34000.00, "CCNA"));
		employeeMap.put(105, new Employee(105, "Janice", "Pune", 67000.00, "CFMG"));

		
		//INPUT EMP ID
		int searchId = 103;
		
		if(employeeMap.containsKey(searchId)) {
			Employee emp = employeeMap.get(searchId);
			System.out.println(emp);
		}
		
	}

}
