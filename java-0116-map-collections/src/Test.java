import java.util.function.Function;


interface MyOwnType{
	void show();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> function = Test::getLength;
		
//		MyOwnType myOwntype = Test::saySomething;
		
		
//		MyOwnType myOwntype = () -> System.out.println("Hello, this is static method.");
		
		MyOwnType myOwnType = Test::saySomething;
	}
	
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	  }  
	 
	 public static int getLength() {
		 return 0;
	 }
	 
	 public static int getLength(String str) {
		 return 0;
	 }
	 
	  
	 
	 

}
