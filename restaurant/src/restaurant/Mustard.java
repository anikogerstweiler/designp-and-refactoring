package restaurant;

public class Mustard extends Extra {

	private double effect = -1;

	public Mustard(Product product) {
		super(product);
	}

	@Override
	public double calculateEffect(double happiness) {
		double productEffect = product.calculateEffect(happiness);

		return (productEffect + productEffect * effect) + 1;
	}

	@Override
	public String toString() {
		return product + " with Mustard";
	}

}
