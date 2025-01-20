import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> dates = new ArrayList<>();
		
		dates.add("06-01-2003");
		dates.add("21-09-2002");
		dates.add("01-09-2002");
		dates.add("09-10-2002");

		Collections.sort(dates);

		System.out.println(dates);

	}

}
