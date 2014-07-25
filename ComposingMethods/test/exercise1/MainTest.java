package exercise1;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void testGetPrimesDefault() {
		List<Integer> result = Main.getPrimes(10);
		Assert.assertArrayEquals(new Integer[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 }, result.toArray());
	}

	@Test
	public void testGetPrimesForNegative() {
		List<Integer> result = Main.getPrimes(-1);
		Assert.assertTrue("Result is not empty for (count = -1).", result.isEmpty());
	}

	@Test(timeout = 5000)
	public void testGetPrimesForLargeNumber() {
		List<Integer> result = Main.getPrimes(30000);
		Assert.assertEquals(30000, result.size());
	}

}
