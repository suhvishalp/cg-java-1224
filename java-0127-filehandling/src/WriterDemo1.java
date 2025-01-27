import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try(FileWriter writer = new FileWriter("xyz.txt", true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer)
				){
			
			bufferedWriter.write(" \nsome more info written to this file");
			
		}catch (IOException e) {
			// TODO: handle exception
		}
	}

}
