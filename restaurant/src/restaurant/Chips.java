package restaurant;

public class Chips implements Product {

	private double effect = 0.05;

	@Override
	public double calculateEffect(double happiness) {
		return happiness * effect;
	}

	@Override
	public String toString() {
		return "Chips";
	}

}
