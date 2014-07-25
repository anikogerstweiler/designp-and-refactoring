package solution3;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void testCode1() {
		Assert.assertEquals("abcdef", Main.code("abcdef-t-1"));
	}

	@Test
	public void testCode2() {
		Assert.assertEquals("abcdef", Main.code("abcdef-1"));
	}

	@Test
	public void testCode3() {
		Assert.assertEquals("abcdef", Main.code("abcdef-t"));
	}

	@Test
	public void testCode4() {
		Assert.assertEquals("abcdef", Main.code("abcdef"));
	}

	@Test
	public void testSuffix1() {
		Assert.assertEquals("t", Main.suffix("abcdef-t-1"));
	}

	@Test
	public void testSuffix2() {
		Assert.assertEquals("", Main.suffix("abcdef-1"));
	}

	@Test
	public void testSuffix3() {
		Assert.assertEquals("t", Main.suffix("abcdef-t"));
	}

	@Test
	public void testSuffix4() {
		Assert.assertEquals("", Main.suffix("abcdef"));
	}

	@Test
	public void testOrdinal1() {
		Assert.assertEquals(1, Main.ordinal("abcdef-t-1"));
	}

	@Test
	public void testOrdinal2() {
		Assert.assertEquals(1, Main.ordinal("abcdef-1"));
	}

	@Test
	public void testOrdinal3() {
		Assert.assertEquals(0, Main.ordinal("abcdef-t"));
	}

	@Test
	public void testOrdinal4() {
		Assert.assertEquals(0, Main.ordinal("abcdef"));
	}
}
