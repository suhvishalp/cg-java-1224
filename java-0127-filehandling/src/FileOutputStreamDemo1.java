import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		
		String str = "Helloworld! this is sample text";
		
		byte[] arr = str.getBytes();
		
		fos.write(arr);
		
		fos.close();
		
	}

}
