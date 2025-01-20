import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		
		String str = "2025-01-18";
		
		
		LocalDate dob = LocalDate.of(2003, 1, 6);
		
		System.out.println(today.getDayOfWeek());
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
		
		LocalDate date = LocalDate.parse(str);
		
		System.out.println("Today : "+ today.format(pattern));
//		
//		System.out.println(dob);
//		
		Period period =	Period.between(dob, today);
//		
//		System.out.println(period);
		
//		LocalDate startDate = LocalDate.of(2024, 1, 17);
//		LocalDate endDate = LocalDate.of(2025, 2, 18);
//
//		Period period = Period.between(startDate, endDate);
//		
		System.out.println("years: " + period.getYears());
		System.out.println("Months : " + period.getMonths());
		System.out.println("Days :" + period.getDays());
	}

}
