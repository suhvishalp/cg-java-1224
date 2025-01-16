import java.util.Map;
import java.util.stream.Collectors;

public class Student {

	private int studId;
	private String name;
	private Map<String, Integer> marks;
	
	public Student(int studId, String name, Map<String, Integer> marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\n\n" + studId + " " + name + " marks=" + marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	
	public int getTotalMarks() {
		
		return this.marks.values()
				.stream()
				.mapToInt(intObj -> intObj.intValue())
				.sum();
	}
	
	public int intValue() {
		return 0;
	}
	
}
