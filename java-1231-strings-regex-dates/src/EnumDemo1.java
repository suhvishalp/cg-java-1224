
public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day today = Day.TUESDAY;
		
		switch(today) {
		
		case MONDAY:
			System.out.println("Today is Monday");
			break;
			
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
			
		//..
			
			default:
				System.out.println("Invalid");
		}

	}

}
