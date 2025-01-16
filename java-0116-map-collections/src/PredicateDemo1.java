import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,5,34,66,45,3,23,32,12,54,3,4,34};
		
		Predicate<Integer> isEven = (value) ->  value % 2 == 0;
		
		System.out.println("Showing all even numbers:");
		show(arr, isEven);
		
		System.out.println("\n\nShowing all the odd numbers: ");
		Predicate<Integer> isOdd = (value) ->  value % 2 != 0;
		show(arr, isOdd);
		
		Predicate<Integer> isGreaterthan50 = (value) -> value >= 50;
		
		System.out.println("\n\nShowing all the even numbers greater than 50: ");

		Predicate<Integer> isEvenGreaterThan = isEven.and(isGreaterthan50);
		show(arr, isEvenGreaterThan);
	}
	
	public static void show(int[] arr, Predicate<Integer> predicate) {
		
		//show all the number where the predicate is true
		for(int value : arr) {
			if(predicate.test(value))
				System.out.print(value + " ");
		}
		
	}

}
