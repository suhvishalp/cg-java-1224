
public class MyThread extends Thread {

	public void run() {
		
		for(int j=1; j<=10; j++) {
			System.out.println(Thread.currentThread().getName() + " j = " + j);
//			System.out.println("T1 State :" + Thread.currentThread().getState());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
}
