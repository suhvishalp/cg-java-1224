
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		MyThread t1 = new MyThread();		
		System.out.println("t1 state :" + t1.getState());	//NEW
		
		
		t1.start();  //Runnable 
		
		for(int i=1; i<=10; i++) {
			System.out.println("\t " + Thread.currentThread().getName() + ": i = " + i);
//			Thread.sleep(1500);
//			
//			System.out.println("T1 State :" + t1.getState());
		}
		
		
		
		
		
	}

}
