package restaurant;

public class Ketchup extends Extra {

	private static final double EFFECT = 2;
	
	public Ketchup(Product product) {
		super(product);
	}

	@Override
	public double getEffect() {
		return EFFECT;
	}

	@Override
	public double changeEffect() {
		double productEffect = product.getEffect();
		
		double happiness = product.getHappiness();
		happiness += (happiness * productEffect) * EFFECT;
		
		return happiness;	
	}


}
