import java.util.List;
import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> squareFunction = value -> value * value;
		
		List<Integer> list = List.of(1,2,3,4);
		
		List<Integer> listSquare = list.stream()
			.map(squareFunction)
			.toList();
		
		System.out.println(listSquare);
		
		
//		List<Character> vowels = List.of('a','e','i','o','u');
//		
//		Function<String, Integer> countVowels = str -> {
//			
//			int count = 0;
//			
//			//logic to count the vowels 
//			
//			return count;
//		};

	}
	
	
	
//	int vowelCount(String str){
//		
//		//logic to count the vowels in the str
//		
//		return 0;
//		
//	}

}
