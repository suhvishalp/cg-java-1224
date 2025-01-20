import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Input Age :" );
			int age = scanner.nextInt();
			
			if(age>=18) {
				System.out.println("Age :" + age);
				System.out.println("You are eligible for driving licenses ");
			}else {
				throw new InvalidAgeException("Age is not valid, it should be less than 18");
			}
			
		}catch(InputMismatchException ex) {
			//corrective actions
			System.out.println("The age is incorrect");
		}catch (InvalidAgeException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}

}
