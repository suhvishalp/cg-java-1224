
public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//validate pan card number
		String personName="Vishal Shah";
		String panCardNumber = "BLZPS4523A";
		
//		char ch = personName.charAt(personName.indexOf(" ")+1);
		
		String pattern = "^[A-Z]{3}[TFHPC][S][0-9]{4}[A-Z]$";
		
		if(panCardNumber.matches(pattern))
			System.out.println("valid pan card");
		else 
			System.out.println("invalid pan card");
	}

}
