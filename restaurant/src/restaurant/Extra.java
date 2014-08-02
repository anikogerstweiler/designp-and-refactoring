package restaurant;

public abstract class Extra {
	
	protected Product product;
	
	public Extra(Product product) {
		this.product = product;
	}

	public abstract double getEffect();
	
	public abstract double changeEffect();

}
