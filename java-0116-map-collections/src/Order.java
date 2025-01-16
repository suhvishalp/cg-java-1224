import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Order {

	private int orderId;
	private Map<Product, Integer> items;
	private double totalCost;
	
	//constructor 
	public Order() {
		super();
		this.items = new HashMap<>();
	}

	public Order(int orderId) {
		super();
		this.orderId = orderId;
		this.items = new HashMap<>();
	}

	public int getOrderId() {
		return orderId;
	}

	public Map<Product, Integer> getItems() {
		return items;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	public void addItem(Product product, int quantity) {
		this.items.put(product, quantity);
		calculateTotalCost();
	}
	
	public void calculateTotalCost() {
		
		this.totalCost = 0.0;
		
		Set<Map.Entry<Product, Integer>> set = this.items.entrySet();
		
		for(Map.Entry<Product, Integer> entry: set) {
			Product product = entry.getKey();
			int quantity = entry.getValue();
			
			this.totalCost += (product.getPrice() * quantity);
		}
	}
	
	
	
	
}
