import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = List.of(
				new Student(101, "Isha", Map.of("Maths", 89, "Phy", 56, "Chem", 87)),
				new Student(101, "Isha", Map.of("Maths", 89, "Phy", 56, "Chem", 87)),
				new Student(102, "Janice", Map.of("Maths", 34, "Phy", 45, "Chem", 90)),
				new Student(103, "Payal", Map.of("Maths", 43, "Phy", 56, "Chem", 23)),
				new Student(104, "Samruddhi", Map.of("Maths", 23, "Phy", 21, "Chem", 55)),
				new Student(105, "Harika", Map.of("Maths", 65, "Phy", 67, "Chem", 87))		
			);
		
//		students
//			.stream()
//			.map(student -> student.getName() )
//			.sorted( (s1, s2) -> Integer.compare(s1.length(), s2.length()) )
//			.forEach(student -> System.out.println(student));
		
		students
			.stream()
//			.sorted((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()) )
			.sorted(Comparator.comparingInt(Student::getTotalMarks))
			.limit(2)
			.forEach(System.out::println);
		

	}
	
	 
	
	
	 
	
	 
}
