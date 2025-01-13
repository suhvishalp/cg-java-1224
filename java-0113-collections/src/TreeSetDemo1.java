import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Student> studSet = new TreeSet<>();
		
		studSet.add(new Student(1, "Isha", 89));
		studSet.add(new Student(2, "Janice", 45));
		studSet.add(new Student(3, "Payal", 65));
		studSet.add(new Student(4, "Samruddhi", 77));
		studSet.add(new Student(5, "Harika", 70));
		studSet.add(new Student(6, "Isha", 87));
		
		System.out.println(studSet);
		
	}

}
