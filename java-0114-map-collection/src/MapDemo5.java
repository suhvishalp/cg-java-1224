import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(2, "legal");
		map.put(5, "illegal");
		map.put(3, "legal");
		map.put(11, "illegal");
		map.put(1, "legal");
		
		int result = maxCost(map, 2);
		System.out.println(result);
	}
	
	public static int maxCost(Map<Integer, String> map, int dailyCount) {
		
		for(Map.Entry<Integer, String>  entry: map.entrySet()) {
			
			int cost = entry.getKey();
			String label = entry.getValue();
			
			
			
		}
		
		
		return 0;
	}
	
	

}
