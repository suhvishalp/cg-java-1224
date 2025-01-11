import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numsList = new ArrayList<>(Arrays.asList(34,23,54,34,54,23,23));
		
 
//		Collections.sort(numsList, (n1, n2) -> Integer.compare(n2, n1));
		
		numsList.sort((n1, n2) -> Integer.compare(n2, n1));
		
		
		System.out.println(numsList);
	}

}
