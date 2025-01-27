
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable task = () -> {
				System.out.println("this is a task being executed by a thread.");
		};
		
		Thread t = new Thread(task);
		t.start();
		
	}

}
