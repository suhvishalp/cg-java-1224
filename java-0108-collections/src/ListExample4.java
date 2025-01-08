import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.NameList;

public class ListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numsList = new ArrayList<>(Arrays.asList(12,34,23,54,45,6,45,3,65,5,43,23));
	
	
		//sort the list 
		Collections.sort(numsList);
		System.out.println("After sort :" + numsList);
		
		List<String> namesList = new ArrayList<>();
		namesList.addAll(Arrays.asList("Payal","Janice","Isha","Anchal","Janhvi","Vaishnavi"));
		
		Collections.sort(namesList);
		
		System.out.println("After sort :" + namesList);
	
	}

}
