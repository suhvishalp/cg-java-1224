import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		
		System.out.println(dt);
		
		System.out.println(dt.getDate());
		
		System.out.println(dt.getMonth());
		
		System.out.println(dt.getYear());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(sdf.format(dt));
		
		String doj = "17-dec-2024";
		Date dateOfJoining = sdf.parse(doj);
		
		System.out.println("Date of Joining = " + sdf.format(dateOfJoining));

	}

}
