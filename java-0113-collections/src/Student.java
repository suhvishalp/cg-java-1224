import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int studId;
	private String name;
	private int marks;
	
	public Student() {
		super();
	}

	public Student(int studId, String name, int marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && studId == other.studId;
	}

	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return Integer.compare(other.getMarks(), this.marks);
	}

	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
