package solution2;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;

	private List<Category> categories = new ArrayList<Category>();

	public Product(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: ");
		stringBuilder.append(name);
		stringBuilder.append(", Catgories: ");
		for (Category category : categories) {
			stringBuilder.append(category).append(" ");
		}
		
		return stringBuilder.toString();
	}

	public void addCategory(Category category) {
		getCategories().add(category);
	}

}
