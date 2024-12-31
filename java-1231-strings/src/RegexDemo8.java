import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Today's date is 2024-12-31";
		
		String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		if(matcher.find()) {
			System.out.println("Year : " + matcher.group(1));
			System.out.println("Month : " + matcher.group(2));
			System.out.println("Date : " + matcher.group(3));
		}
		

	}

}
