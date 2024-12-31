import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aadharNumber = "8283-4323-5423-4543";
		
		String regex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(aadharNumber);
		
		if(matcher.matches()) {
			System.out.println("Aadhar number is valid");
		}else {
			System.out.println("invalid");
		}

	}

}
