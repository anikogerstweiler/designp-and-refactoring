package solution2;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	static int getXDistance(Point p1, Point p2) {
		return p2.x - p1.x;
	}

	static int getYDistance(Point p1, Point p2) {
		return p2.y - p1.y;
	}
}