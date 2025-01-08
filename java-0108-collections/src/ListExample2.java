import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(340);
		numsList.add(55);
		numsList.add(23);
		numsList.add(340);
		numsList.add(340);
		
		numsList.add(3, 76);
		
				
		System.out.println("Before remove: " + numsList);
		
//
//		for(int i=0; i<numsList.size(); i++) {
//			System.out.println(i + "");
//			if(numsList.get(i).equals(new Integer(340))) {
//				System.out.println("removing :" + numsList.get(i) + " i: " + i);
//				numsList.remove(i);
//				i--;
//			}
//		}
		
		numsList.removeIf(value -> value.equals(new Integer(340)));
		
		System.out.println("after remove: " + numsList);
	}

}
