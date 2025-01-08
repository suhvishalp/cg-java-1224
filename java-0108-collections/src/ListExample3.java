import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		
		//add elements in the list
		list.add(new Employee(101, "Anchal", "Pune", 34000.00));
		list.add(new Employee(102, "Payal", "Hyderabad", 45000.00));
		list.add(new Employee(103, "Jagruti", "Chennai", 23000.00));
		list.add(new Employee(104, "Isha", "Pune", 15000.00));
		list.add(new Employee(105, "Janhvi", "Pune", 54000.00));
		
		//remove elements from the list
			//- remove(index)
			//- remove(E e)	- compares the given element with all other elements using 'equals()'
	
	
		//search an element 
		Employee employeeToBeSearched = new Employee(102, "Payal", "Pune", 53400.00);
		
			if(list.contains(employeeToBeSearched))
				System.out.println("found in the list");
			else 
				System.out.println("not found");
			
			
		//sort the list of employees 
//			Collections.sort(list);
			
			
		//sort the list of employee with salary
//			Comparator<Employee> salComparator = new EmployeeSalaryComparator();
//			Collections.sort(list, salComparator );
			
		//sort the list of employee with city
			Collections.sort(list, new EmployeeCityComparator());
			
		System.out.println(list);
		 
	} 

}
