package restaurant;

public abstract class Decorator extends Product {
	
	protected Product product;
	
	public Decorator(double happiness) {
		super(happiness);
	}

	@Override
	public double changeHappiness() {
		return product.changeHappiness();
	}
	
	
	
	
}
