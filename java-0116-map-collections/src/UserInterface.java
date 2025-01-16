import java.util.ArrayList;
import java.util.List;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(101, "Product 1", 100.00, 50);
		Product p2 = new Product(102, "product 2", 200.00, 50);
		
		Order order1 = new Order(1);
		
		order1.addItem(p1, 2);
		System.out.println("Total cost : "+ order1.getTotalCost());
		
		order1.addItem(p2, 1);
		System.out.println("Total cost : "+ order1.getTotalCost());
		
		
		List<Order> orderList = new ArrayList<>();
		orderList.add(order1);
		
		//100 orders 

	}

}
