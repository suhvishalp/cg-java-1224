import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Input number 1 :" );
			int number1 = scanner.nextInt();
			
			System.out.println("number 1 :" + number1);
			
			System.out.println("Enter number 2");
			int number2 = scanner.nextInt();
			
			System.out.println("number 2 :" + number2);
			
			int result = number1 / number2;
			System.out.println("Result :" + result);
			
		}catch(InputMismatchException ex) {
			//corrective actions
			System.out.println("The input is incorrect");
			System.out.println("Message :" + ex.getMessage());
			ex.printStackTrace();
		}catch(ArithmeticException ex) {
			System.out.println("number cannot be divided by 0");
			System.out.println("Message :" + ex.getMessage());
			ex.printStackTrace();
		}catch(Exception ex) {
			System.out.println("something went wrong");
			System.out.println(ex.getMessage());
		}
		
		System.out.println("The program ends!");
	}

}
