import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = List.of(
				
					new Student(101, "Isha", Map.of("Maths", 89, "Phy", 56, "Chem", 87)),
					new Student(102, "Janice", Map.of("Maths", 34, "Phy", 45, "Chem", 90)),
					new Student(103, "Payal", Map.of("Maths", 43, "Phy", 56, "Chem", 23)),
					new Student(104, "Samruddhi", Map.of("Maths", 23, "Phy", 21, "Chem", 55)),
					new Student(105, "Harika", Map.of("Maths", 65, "Phy", 67, "Chem", 87))		
				);
		
		Predicate<Student> hasPassed = (student) -> student.getMarks().values().stream().allMatch(mark -> mark >= 50);
				
		List<Student> passedStudents =  students
											.stream()
											.filter(hasPassed)
											.toList();
		System.out.println(passedStudents);
	}

}
