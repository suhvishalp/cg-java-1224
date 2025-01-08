import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List list = new ArrayList<>();
		
		list.add(12);
		list.add("hello");
		list.add(23.54F);
		list.add(342);
		list.add(45.00);
		list.add("hello");
		list.add("hello");
		list.add(23.54F);
		list.add(342);
		list.add(45.00);
		list.add(56.343);
		
		System.out.println(list);
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for(Object obj: list) {
			System.out.println(obj);
		}
		
		
	}

}
