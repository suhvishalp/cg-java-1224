import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		
		//10 students added to the list 
		
		Collections.sort(list,(s1,  s2) -> Integer.compare(s1.getStudId(), s2.getStudId()) );
		
		list.sort(Comparator.comparingInt( stud -> stud.getStudId() ));
		
	}

}
