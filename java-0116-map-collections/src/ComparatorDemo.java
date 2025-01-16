import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ProductComparator comparator = new ProductComparator();

//		Comparator<Product> comparator = new ProductComparator();
		
		
//		Comparator<Product> comparator = new Comparator<Product>() {
//
//			@Override
//			public int compare(Product p1, Product p2) {
//				// TODO Auto-generated method stub
//				return Double.compare(p1.getPrice(), p2.getPrice());
//			}
//			
//		};
		
		Comparator<Product> comparator = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());

	}

}
