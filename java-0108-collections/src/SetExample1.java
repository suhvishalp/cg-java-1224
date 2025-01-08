import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new TreeSet<>();
		
		set.add(132);
		set.add(33);
		set.add(132);
		set.add(45);
		set.add(78);
		set.add(21);
		
		System.out.println(set);
	}

}
