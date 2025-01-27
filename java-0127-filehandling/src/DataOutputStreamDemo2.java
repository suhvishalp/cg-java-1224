import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int i = 1200;
		short s = 34;
		double d = 434.543;
		float f = 65.33F;
		long l = 43234324L;
		String str = "hello";
		
		dos.writeInt(i);
		dos.writeShort(s);
		dos.writeDouble(d);
		dos.writeFloat(f);
		dos.writeLong(l);
		dos.writeUTF(str);
		
		dos.close();
	}

}
