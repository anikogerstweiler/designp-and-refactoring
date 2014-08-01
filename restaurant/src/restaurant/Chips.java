package restaurant;

public class Chips extends Product {

	private static final double EFFECT = 0.05;
	
	public Chips(double happiness) {
		super(happiness);
	}

	@Override
	public double changeHappiness() {
		return happiness + (happiness * EFFECT) ;
	}

	@Override
	public double getEffect() {
		return EFFECT;
	}
	

}
