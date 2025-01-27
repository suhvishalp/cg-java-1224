
public class MyTask implements Runnable {

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		
		System.out.println("task execution started by " + threadName);
	
		for(int i=0; i<10; i++) {
			System.out.println("\t " + threadName + ": i = " + i);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("task execution ended " + threadName);

	}
}
