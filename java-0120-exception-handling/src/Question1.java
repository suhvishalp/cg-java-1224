import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String[][] logs = {
				
				{"1", "01-01-2023", "16:30", "ERROR", "FAILED"},
				{"4", "01-01-2023", "01:30", "CRITICAL", "FAILED"},
				{"2",  "01-01-2023", "14:00", "ERROR", "FAILED"},
				{"3",  "01-01-2023", "15:00", "ERROR", "ESTABLISHED"}
				
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
			
			Date datetime1 = null;
			Date datetime2 = null;
			
			try {
								//"01-01-2023 : 01:30"				//
				datetime1 = sdf.parse(record1.get(1) + ":" + record1.get(2) );
				datetime2 = sdf.parse(record2.get(1) + ":" + record2.get(2));
				
				if(datetime1.equals(datetime2)) {
					return 0;
				}else if(sdf.parse(record1.get(1)).equals(sdf.parse(record2.get(1)))){
					return sdf.parse(record1.get(2)).compareTo(sdf.parse(record2.get(2)));
				}else {
					return sdf.parse(record1.get(2)).compareTo(sdf.parse(record2.get(2)));
				}

			}catch(Exception ex) {
				
			}
			
			return datetime1.compareTo(datetime2);
		} );
		
		return extractedlogs;
	}

}
