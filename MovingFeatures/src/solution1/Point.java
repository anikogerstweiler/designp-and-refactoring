package solution1;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	double getDistance(Point p2) {
		return Math.sqrt((p2.getX() - getX()) * (p2.getX() - getX())
				+ (p2.getY() - getY()) * (p2.getY() - getY()));
	}
}