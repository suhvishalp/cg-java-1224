import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> names = new TreeSet<>(new StringLengthComparator());
		
		names.addAll(Arrays.asList("Janice","Isha","Ikra", "heena", "Payal","Samruddhi","Jagriti","Janhavi","Ishwari","Ishika","Harshita","Ishwari"));
	
		System.out.println(names);
	}

}
