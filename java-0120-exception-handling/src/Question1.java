import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String[][] logs = {
				
				{"1", "01-01-2023", "01:30", "ERROR", "FAILED"},
				{"2",  "01-01-2023", "14:00", "ERROR", "FAILED"},
				{"3",  "01-01-2023", "15:00", "INFO", "ESTABLISHED"}
				
		};
		
		List<List<String>> logsdata = new ArrayList<>();
		
		for(String[] rec: logs) {
			List<String> record = new ArrayList<>();
			for(String value: rec) {
				record.add(value);
			}
			logsdata.add(record);
		}
		
		
		for(List<String> list: logsdata) {
			System.out.println(list);
		}
		
		System.out.println("after sorting");
		List<List<String>> list = analyseLogs(logsdata);
		
		for(List<String> result: list) {
			System.out.println(result);
		}
		
	}
	
	public static List<List<String>> analyseLogs(List<List<String>> logsdata) throws ParseException{
		
		List<List<String>> extractedlogs = new ArrayList<>();
		

		for(List<String> record: logsdata) {
			String status = record.get(3);
			if(status.equals("ERROR") || status.equals("CRITICAL")) {
				extractedlogs.add(record);
			}
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY:HH:MM");
		
//			extractedlogs.sort((record1, record2) -> {
//						
//					String time1 = 	record1.get(2);
//					String time2 = record2.get(2);
//							
//							if(record1.get(1).equals(record2.get(1))){
//								return time1.compareTo(time2);
//							}
//						return time1.compareTo(time2);
//				}
//			 );
		
		extractedlogs.sort((record1, record2) -> {
			
			Date time1 = null;
			Date time2 = null;
			
			try {
				
				System.out.println("Time1 :" + record1.get(1));
				System.out.println("Time2 :" + record2.get(1));
			
				time1 = sdf.parse(record1.get(1) + ":" + record1.get(2) );
				time2 = sdf.parse(record2.get(1) + ":" + record2.get(2));
				
				System.out.println("time1 : "+ time1);
				System.out.println("time2 : "+ time2);
				
				if(time1.equals(time2)) {
					return 0;
				}else if(sdf.parse(record1.get(1)).equals(sdf.parse(record2.get(1)))){
					return sdf.parse(record1.get(2)).compareTo(sdf.parse(record2.get(2)));
				}else {
					sdf.parse(record1.get(2)).compareTo(sdf.parse(record2.get(2)));
				}

			}catch(Exception ex) {
				
			}
			
			return time1.compareTo(time2);
		} );
		
		return extractedlogs;
	}

}
