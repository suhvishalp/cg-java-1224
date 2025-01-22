import java.util.HashMap;
import java.util.Map;

public class TeamOfSuperHeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String powers = "stfxiiiissssssssstfxtfiiiiiii";
		
		int teamCount = teams(powers);
		System.out.println("Number of Teams :" + teamCount);

	}
									//stifxstifx
	public static int teams(String powers) {
		
		Map<Character, Integer> powerMap = new HashMap<>();
		powerMap.put('s', 0);
		powerMap.put('t', 0);
		powerMap.put('i', 0);
		powerMap.put('f', 0);
		powerMap.put('x', 0);
		
		for(Character ch : powers.toCharArray()) {
			
			if(powerMap.containsKey(ch)) {
				powerMap.put(ch, powerMap.get(ch) + 1 );
			}
		}
		
		int max = Integer.MAX_VALUE;
		for(char key: powerMap.keySet()) {
			max =	Math.min(max, powerMap.get(key));
		}
		
		System.out.println(powerMap);
		
		
		return max;
	}

}
