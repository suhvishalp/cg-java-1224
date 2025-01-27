import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try(FileReader reader =new FileReader("abc.txt");
				BufferedReader buffer = new BufferedReader(reader)
			) {
	
			//perform the operations i.e. read the data from the file
			
			String line;
			while( (line = buffer.readLine())!= null)
				System.out.println(line);
		
				
		}catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		
//		File file = null;
//		FileReader reader = null;
//		BufferedReader buffer = null;
//		
//		try {
//			
//			file = new File("abc.txt");
//			reader = new FileReader(file);	//open the stream
//			buffer = new BufferedReader(reader);
//			
//			//perform the operations i.e. read the data from the file
////			int data;
////						
////			while ( (data = buffer.read()) != -1 ) {
////				System.out.print((char)data);
////			}
//			
//			String line;
//			while( (line = buffer.readLine())!= null)
//				System.out.println(line);
//		
//				
//		}catch(FileNotFoundException ex) {
//			System.out.println(ex.getMessage());
//			
//		}catch(IOException ex) {
//			System.out.println(ex.getMessage());
//		}finally {
//			
//			//close the stream
//			try {
//				if(buffer!=null)
//					buffer.close();
//			}catch(IOException ex) {
//				System.out.println(ex.getMessage());
//			}
//		}
//		
		
	}
		

}
