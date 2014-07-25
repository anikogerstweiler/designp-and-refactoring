package exercise1;

import org.junit.Assert;
import org.junit.Test;

public class UserManagerTest {

	@Test
	public void testValidLogin() {
		UserManager userManager = new UserManager();
		userManager.addUser("endre", "jelszo");
		Assert.assertNotNull(userManager.login("endre", "jelszo"));
	}
	
	@Test
	public void testInvalidLogin1() {
		UserManager userManager = new UserManager();
		userManager.addUser("endre", "jelszo");
		Assert.assertNull(userManager.login("endre", "mas_jelszo"));
	}
	
	@Test
	public void testInvalidLogin2() {
		UserManager userManager = new UserManager();
		userManager.addUser("endre", "jelszo");
		Assert.assertNull(userManager.login("endre", null));
	}

	@Test
	public void testInvalidLogin3() {
		UserManager userManager = new UserManager();
		userManager.addUser("endre", "jelszo");
		Assert.assertNull(userManager.login(null, null));
	}
	
	@Test
	public void testInvalidLogin4() {
		UserManager userManager = new UserManager();
		userManager.addUser("endre", "jelszo");
		Assert.assertNull(userManager.login(null, "jelszo"));
	}
}
