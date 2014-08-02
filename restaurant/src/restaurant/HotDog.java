package restaurant;

public class HotDog extends Product {

	private static final double EFFECT = 2;
	
	public HotDog(double happiness) {
		super(happiness);
	}

	@Override
	public double changeHappiness() {
		return happiness + EFFECT;
	}

	@Override
	public double getEffect() {
		return EFFECT;
	}
	
	

}
