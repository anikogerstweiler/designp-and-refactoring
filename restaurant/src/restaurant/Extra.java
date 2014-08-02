package restaurant;

public abstract class Extra implements Product {

	protected Product product;

	public Extra(Product product) {
		this.product = product;
	}

}
