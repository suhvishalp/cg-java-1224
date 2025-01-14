import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	
	public static void main(String[] args) {
		
		Map<Integer, String> map  = new TreeMap<>();
		
		
		map.put(104, "Isha");
		map.put(106, "Ishika");
		map.put(105, "Isha");
		map.put(107, "Isha");
		map.put(101, "Vaishnavi");
		map.put(102, "Samruddhi");
		map.put(103, "Payal");

//		Collection<String> values = map.values();
//
//		for(String name: values) {
//			System.out.println(name);
//		}
		
//		for(String name: map.values()) {
//			System.out.println(name);
//		}
		
		
		//using keySet() method
//		Set<Integer> set =  map.keySet();
//	
//		for(Integer key: set) {
//			System.out.println("Key:" + key + " value:" + map.get(key));
//		}
		
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> entry: entrySet) {
			System.out.println("key :" + entry.getKey() + " Value: " + entry.getValue());
		}
		
		
		//System.out.println(map);
		
	}
}
