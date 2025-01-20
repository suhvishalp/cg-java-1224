import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<Integer> predicate = (Integer value) -> value > 100; 
		
		Function<String, Integer> function = (String str) -> str.length();
		
		Function<Integer, Integer> function2 = (Integer value) -> 0;

 		
		Supplier<Double> supplier = () -> Math.random()*10;
		
		Consumer<Integer> consumer = (Integer value) -> System.out.println(value); 

	}

}
