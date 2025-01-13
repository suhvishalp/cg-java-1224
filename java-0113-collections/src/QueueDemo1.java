import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		
		queue.add(10);

		queue.add(20);

		queue.add(30);

		queue.add(40);

		queue.add(50);
		
		System.out.println(queue);
		
		System.out.println(queue.offer(45));
		
		try {
			queue.put(34);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
