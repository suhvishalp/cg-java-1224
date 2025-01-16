import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPrice(), p2.getPrice());
	}

}
