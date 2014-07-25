package solution2;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void testLineIntersectAngle() {
		Point p = Main.lineIntersect(new Point(6000, 0), new Point(0, 3000), new Point(0, 1000), new Point(5000, 2000));
		Assert.assertNotNull(p);
		Assert.assertEquals(2857, p.getX());
		Assert.assertEquals(1571, p.getY());
	}

	@Test
	public void testLineIntersectDiagonal() {
		Point p = Main.lineIntersect(new Point(0, 0), new Point(0, 3000), new Point(0, 0), new Point(5000, 0));
		Assert.assertNotNull(p);
		Assert.assertEquals(0, p.getX());
		Assert.assertEquals(0, p.getY());
	}
	
	@Test
	public void testLineIntersectParallel() {
		Point p = Main.lineIntersect(new Point(0, 0), new Point(0, 3000), new Point(100, 0), new Point(100, 3000));
		Assert.assertNull(p);
	}
	
	@Test
	public void testLineIntersectOutside() {
		Point p = Main.lineIntersect(new Point(0, 0), new Point(0, 3000), new Point(10, 0), new Point(3000, 0));
		Assert.assertNull(p);
	}
}
