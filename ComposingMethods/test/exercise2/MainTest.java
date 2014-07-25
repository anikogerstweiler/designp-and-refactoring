package exercise2;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void testLineIntersectAngle() {
		Point p = Main.lineIntersect(6000, 0, 0, 3000, 0, 1000, 5000, 2000);
		Assert.assertNotNull(p);
		Assert.assertEquals(2857, p.x);
		Assert.assertEquals(1571, p.y);
	}

	@Test
	public void testLineIntersectDiagonal() {
		Point p = Main.lineIntersect(0, 0, 0, 3000, 0, 0, 5000, 0);
		Assert.assertNotNull(p);
		Assert.assertEquals(0, p.x);
		Assert.assertEquals(0, p.y);
	}
	
	@Test
	public void testLineIntersectParallel() {
		Point p = Main.lineIntersect(0, 0, 0, 3000, 100, 0, 100, 3000);
		Assert.assertNull(p);
	}
	
	@Test
	public void testLineIntersectOutside() {
		Point p = Main.lineIntersect(0, 0, 0, 3000, 10, 0, 3000, 0);
		Assert.assertNull(p);
	}
}
