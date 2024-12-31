import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "Order ID: 321233 asdf ds 43234 3 sdfds 4234 sd f432 df434";
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher  = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

}
