import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "SDLFIUDK34LSDKJF323LKJK44LKJLK3433LKJK3434";
		
		String regex = "\\d+";
		
		int count = 0;
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			String value = matcher.group();
			System.out.println(value);
			count++;
		}
		
		System.out.println("Number of occurences: " + count);
	}

}
