import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		Employee employee = new Employee(101, "Isha", "Delhi", "HR", 10000.00, "isha@test.com");
		
		dos.writeInt(employee.getEmpId());
		dos.writeUTF(employee.getName());
		
		dos.close();
	}

}
