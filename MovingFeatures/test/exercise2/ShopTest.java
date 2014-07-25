package exercise2;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest {

	@Test
	public void testListProductsForOneItem() {
		Shop shop = new Shop();
		Product product = new Product("book");
		Category category = new Category("category");
		shop.addProduct(product);
		shop.addProductToCategory(product, category);
		Assert.assertEquals("Name: book, Catgories: category \n", shop.listProducts());
	}
	
	@Test
	public void testListProductsForTwoItems() {
		Shop shop = new Shop();
		Product cd= new Product("cd");
		Product dvd = new Product("dvd");
		Category category = new Category("category");
		shop.addProduct(cd);
		shop.addProduct(dvd);
		shop.addProductToCategory(cd, category);
		Assert.assertEquals("Name: cd, Catgories: category \n"
				+ "Name: dvd, Catgories: \n", shop.listProducts());
	}

}
