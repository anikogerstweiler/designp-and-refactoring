package restaurant;


public abstract class Product {
	
	protected double happiness;
	
	public Product(double happiness) {
		this.happiness = happiness;
	}
	
	public abstract double changeHappiness();
	
	public abstract double getEffect();
	
	public double getHappiness() {
		return happiness;
	}
	
}
