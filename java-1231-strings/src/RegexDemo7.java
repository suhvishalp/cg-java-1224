import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "contact us at SUPPORT@test.com or help@test.com, or you can reach out to contact@test.com";
		
		String regex = "[a-zA-Z0-9._+-]+@\\w+\\.\\w{2,6}";
		int count = 0;
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			count++;
		}
		System.out.println("Email addresses in the text are :" + count);
	}

}
