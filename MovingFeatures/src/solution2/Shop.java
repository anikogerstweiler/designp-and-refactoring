package solution2;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private List<Product> products = new ArrayList<Product>();

	public Shop() {

	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addProductToCategory(Product product, Category category) {
		product.addCategory(category);
	}

	public String listProducts() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Product product : products) {
			stringBuilder.append(product);
			stringBuilder.append('\n');
		}
		return stringBuilder.toString();
	}
}
