import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileReader reader = null;
		
		try {
		//read data from a file 
			reader = new FileReader("abc.txt"); 
			
			int data;
			while( (data = reader.read())  != -1) {		////error
				System.out.print((char)data);
			}
		
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
