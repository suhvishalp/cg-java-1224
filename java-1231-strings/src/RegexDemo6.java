import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "this is a TEST string WITH four-letter WORDS like java is good, write clean code";
	
		String regex = "\\b[A-Za-z]{4}\\b";
		int count = 0;
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			count++;
		}
		System.out.println("Count of four-letter words :" + count);
	}

}
