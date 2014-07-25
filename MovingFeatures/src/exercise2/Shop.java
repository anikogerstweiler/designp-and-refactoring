package exercise2;

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
		product.getCategories().add(category);
	}

	public String listProducts() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Product product : products) {
			stringBuilder.append("Name: ");
			stringBuilder.append(product.getName());
			stringBuilder.append(", Catgories: ");
			for (Category category : product.getCategories()) {
				stringBuilder.append(category.getName());
				stringBuilder.append(" ");
			}
			stringBuilder.append('\n');
		}
		return stringBuilder.toString();
	}
}
