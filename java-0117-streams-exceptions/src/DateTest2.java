import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class DateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
		   
		 	ZoneId  india = ZoneId.of("Asia/Kolkata");   
		    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india); 
		    
		    System.out.println("In India Central Time Zone: " + zone1);  
		    
		    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
		    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
		    System.out.println("In Tokyo Central Time Zone:"  + zone2); 
		    
		    Duration duration =	Duration.between(zone1, zone2);
		   List list =  duration.getUnits();
		   list.forEach(System.out::println);
	}

}
