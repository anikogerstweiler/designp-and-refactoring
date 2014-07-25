package solution2;

public class Main {

	public static Point lineIntersect(Point p1, Point p2, Point p3, Point p4) {

		Point intersection = null;
		
		if (!isParalell(p1, p2, p3, p4) && hasIntersection(p1, p2, p3, p4)) {
			intersection = calculateIntersection(p1, p2, p3, p4);
		}

		// intersection outside of sections
		return intersection;
	}

	private static boolean isParalell(Point p1, Point p2, Point p3, Point p4) {
		 return (double) calculateDenominator(p1, p2, p3, p4) == 0.0;
	}

	private static Point calculateIntersection(Point p1, Point p2, Point p3,
			Point p4) {
		return new Point(
				(int) (p1.getX() + calculateFirstDegreeBezierParameter(p1,
						p2, p3, p4) * Point.getXDistance(p1, p2)),
				(int) (p1.getY() + calculateFirstDegreeBezierParameter(p1,
						p2, p3, p4) * Point.getYDistance(p1, p2)));
	}

	private static boolean hasIntersection(Point p1, Point p2, Point p3,
			Point p4) {
		double t = calculateFirstDegreeBezierParameter(p1, p2, p3, p4);
		double u = calculateSecondDegreeBezierParameter(p1, p2, p3, p4);
		
		return t >= 0.0f && t <= 1.0f && u >= 0.0f && u <= 1.0f;
	}

	private static double calculateSecondDegreeBezierParameter(Point p1,
			Point p2, Point p3, Point p4) {
		return (Point.getXDistance(p1, p2) * Point.getYDistance(p3, p1) - Point
				.getYDistance(p1, p2) * Point.getXDistance(p3, p1))
				/ (double) calculateDenominator(p1, p2, p3, p4);
	}

	private static double calculateFirstDegreeBezierParameter(Point p1,
			Point p2, Point p3, Point p4) {
		return (Point.getXDistance(p3, p4) * Point.getYDistance(p3, p1) - Point
				.getYDistance(p3, p4) * Point.getXDistance(p3, p1))
				/ (double) calculateDenominator(p1, p2, p3, p4);
	}

	private static int calculateDenominator(Point p1, Point p2, Point p3,
			Point p4) {
		return Point.getYDistance(p3, p4) * Point.getXDistance(p1, p2)
				- Point.getXDistance(p3, p4) * Point.getYDistance(p1, p2);
	}
}