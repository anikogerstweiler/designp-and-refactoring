package exercise1;

public class Triangle {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public double getPerimeter() {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) + Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2))
				+ Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
	}

	public double getArea() {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
	}

}
