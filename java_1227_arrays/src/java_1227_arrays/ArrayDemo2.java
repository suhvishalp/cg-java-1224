package java_1227_arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[5];
		names[0] = new String("Harika");
		names[1] = "Anchal";
		
		Employee[] employeeArray = new Employee[3];
		
		//employeeArray[0] = new Employee();
		//
		//
		//
		//
		for(int i=0; i<employeeArray.length;i++) {
			employeeArray[i] = new Employee();
			
			//input values for id, name, city, salary
			employeeArray[i].setId(1);
			employeeArray[i].setName("Harika");
			//
			//
		}
		
		
		
	}

}
