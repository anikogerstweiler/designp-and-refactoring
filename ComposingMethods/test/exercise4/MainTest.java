package exercise4;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MainTest {

	private int input;

	private int result;

	public MainTest(int input, int result) {
		this.input = input;
		this.result = result;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 10, 55 }, { 1, 1 }, { 5, 5 } };
		return Arrays.asList(data);
	}

	@Test
	public void testFibonacci() {
		Assert.assertEquals(result, Main.fibonacci(input));
	}

}
