import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("xyz.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		
		int i = dis.readInt();
		System.out.println(i);
		
		short s = dis.readShort();
		System.out.println(s);
		
		double d = dis.readDouble();
		System.out.println(d);
		
		float f = dis.readFloat();
		System.out.println(f);
		
		long l = dis.readLong();
		System.out.println(l);
		
		String str = dis.readUTF();
		System.out.println(str);
		

		dis.close();
	}

}
