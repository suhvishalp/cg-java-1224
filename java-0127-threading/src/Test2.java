
public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + " started");
		
		Runnable task = new MyTask();
		
		Thread t1 = new Thread(task);	//NEW
		t1.start();			//RUNNABLE
		
		Thread t2 = new Thread(task);
		t2.start();
		
		Thread.sleep(10000);
		
		t1.interrupt();
		
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread().getName() + " ended");

		
	}	

}
