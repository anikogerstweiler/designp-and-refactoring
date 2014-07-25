package solution1;

public class Triangle {

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public double getPerimeter() {
		return p1.getDistance(p2)
				+ p3.getDistance(p2)
				+ p3.getDistance(p1);
	}

	public double getArea() {
		return Math
				.abs((p1.getX() * (p2.getY() - p3.getY()) + p2.getX()
						* (p3.getY() - p1.getY()) + p3.getX()
						* (p1.getY() - p2.getY())) / 2);
	}

}
