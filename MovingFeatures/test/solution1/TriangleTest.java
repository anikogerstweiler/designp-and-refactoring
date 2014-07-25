package solution1;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void testPerimeter() {
		Triangle t = new Triangle(new Point(0, 0), new Point(1, 1), new Point(1, 0));
		Assert.assertEquals(t.getPerimeter(), 3.4142, 0.001);
	}
	
	@Test
	public void testArea() {
		Triangle t = new Triangle(new Point(0, 0), new Point(1, 1), new Point(1, 0));
		Assert.assertEquals(t.getArea(), 0.5, 0.001);
	}
	
	@Test
	public void testSectionLength() {
		Assert.assertEquals(Math.sqrt(((double) 1 - (double) 0) * (1 - 0) + ((double) 1 - (double) 0) * (1 - 0)), 1.4142, 0.001);
	}

}
