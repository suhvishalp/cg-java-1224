import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrivingLicense dl = new DrivingLicense();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter age: ");
			int age = scanner.nextInt();
			
			dl.validateAge(age);
			
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}
		

	}

}
