package exercise1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class UserManager {

	private List<String> users = new LinkedList<String>();

	private List<String> passwords = new LinkedList<String>();

	public UserManager() {

	}

	public void addUser(String user, String password) {
		users.add(user);
		passwords.add(password);
	}

	public void removeUser(String user) {
		Iterator<String> userIterator = users.iterator();
		Iterator<String> passwordIterator = passwords.iterator();

		while (userIterator.hasNext()) {
			String actualUser = userIterator.next();
			passwordIterator.next();
			if (actualUser.equals(user)) {
				userIterator.remove();
				passwordIterator.remove();
			}
		}
	}

	public Session login(String user, String password) {
		Iterator<String> userIterator = users.iterator();
		Iterator<String> passwordIterator = passwords.iterator();

		while (userIterator.hasNext()) {
			String actualUser = userIterator.next();
			String actualPassword = passwordIterator.next();
			if (actualUser.equals(user) && actualPassword.equals(password)) {
				return new Session(actualUser, UUID.randomUUID().toString());
			}
		}

		return null;
	}

}
