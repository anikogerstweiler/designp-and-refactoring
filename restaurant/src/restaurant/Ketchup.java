package restaurant;

public class Ketchup extends Extra {

	private double effect = 2;

	public Ketchup(Product product) {
		super(product);
	}

	@Override
	public double calculateEffect(double happiness) {
		double productEffect = product.calculateEffect(happiness);

		return productEffect * effect;
	}

	@Override
	public String toString() {
		return product + " with Ketchup";
	}
}
