      package exercise2;

import java.awt.Point;

public class Main {

	public static Point lineIntersect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		// denominator 
		double temp = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);

		if (temp == 0.0) {
			// Lines are parallel.
			return null;
		}
		
		// first degree Bézier parameter (t)
		double temp2 = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / temp;
		
		// first degree Bézier parameter (u)
		temp = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / temp;
		
		if (temp2 >= 0.0f && temp2 <= 1.0f && temp >= 0.0f && temp <= 1.0f) {
			return new Point((int) (x1 + temp2 * (x2 - x1)), (int) (y1 + temp2 * (y2 - y1)));
		}

		// intersection outside of sections
		return null;
	}
}