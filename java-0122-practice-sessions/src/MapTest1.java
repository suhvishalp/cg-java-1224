import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
	
	public static Map<String, Integer> carMap  = new TreeMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		addCar("mg hector", 10);
		addCar("mg hector", 43);		//show error message i.e. car already exists 
		addCar("MG Hector", 100);		//show error message i.e. car already exists
		addCar("bmw x1", 10);
		addCar("bmw X1", 10);	////show error message i.e. car already exists
		
		int carsSold = carByName("BMW x1");
		System.out.println(carsSold);
	}
	
	//method to add a car and number of cars sold into the treemap 
	public static void addCar(String name, int number) {
		
		//if a car name already exists in the carMap, do not add it again (case insensitive)
	
		boolean flag = carMap.keySet()
				.stream()
				.anyMatch(cname -> cname.equalsIgnoreCase(name));
		
		if(!flag)
			carMap.put(name, number);
		else 
			System.out.println("Car already Exists");
	}
	
	public static void showCars(Map<String, Integer> carMap) {
		//print
	}
	
	public static int carByName(String name) {
		
		//return number of cars sold or else return -1 if the car name doesn't exists
		for(Map.Entry<String, Integer> entry: carMap.entrySet()) {
			if(entry.getKey().equalsIgnoreCase(name)) {
				return entry.getValue();
			}
		}
		
		return -1;
	}
}
