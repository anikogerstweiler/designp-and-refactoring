package restaurant;

public class HotDog implements Product {

	private double effect = 2;

	@Override
	public double calculateEffect(double happiness) {
		return effect;
	}

	@Override
	public String toString() {
		return "HotDog";
	}

}