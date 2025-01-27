import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		
//		FileOutputStream fos = new FileOutputStream("xyz.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Employee employee = new Employee(101, "Isha", "Delhi", "HR", 10000.00, "isha@test.com");
//
//		oos.writeObject(employee);
//		
//		oos.close();
		
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee employee =	(Employee)ois.readObject();
		System.out.println(employee);
		
		ois.close();

	}

}
