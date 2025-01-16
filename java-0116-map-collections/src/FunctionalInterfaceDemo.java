
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Greet greeting = new Greet();
//		greeting.sayHello();
		
//		Hello greeting = new Hello() {
//			
//			@Override
//			public void sayHello() {
//				// TODO Auto-generated method stub
//				System.out.println("Saying Hello....");
//			}
//		};
		
		Hello greeting = () -> System.out.println("Saying Hello....");
		
		greeting.sayHello();
	}

}
