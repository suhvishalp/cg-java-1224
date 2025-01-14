import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(34);
 
		
		queue.add(3);
		
		queue.add(45);
		
		queue.add(12);
		
		queue.add(7);

//		for(int value: queue)
//			System.out.println(value);
		
		for(int i=0; i<queue.size(); i++) {
			
			int value = queue.remove();
			System.out.println(value);
			
			i--;
			
		}
		
	}

}
