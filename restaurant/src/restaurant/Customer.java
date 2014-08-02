package restaurant;

public class Customer {
	private String name;
	private double happiness;

	public Customer(String name, double happiness) {
		this.name = name;
		this.happiness = happiness;
	}

	public double getHappiness() {
		return happiness;
	}

	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}

	public double eat(double productEffect) {
		this.happiness += productEffect;
		return this.happiness;
	}

	@Override
	public String toString() {
		return name;
	}

}
