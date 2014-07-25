package solution1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserManager {

	private List<User> users = new LinkedList<User>();

	public UserManager() { }

	public void addUser(String name, String password) {
		users.add(new User(name, password));
	}

	public void removeUser(final String name) {
		Iterator<User> userIterator = users.iterator();

		while (userIterator.hasNext()) {
			User actualUser = userIterator.next();
			if (actualUser.getName().equals(name)) {
				userIterator.remove();
			}
		}
	}

	public Session login(String name, String password) {
		Iterator<User> userIterator = users.iterator();

		User user = new User(name, password);
		
		Session session = null;
		while (userIterator.hasNext() && session == null) {
			User actualUser = userIterator.next();
			if (actualUser.equals(user)) {
				session = new Session(actualUser);
			}
		}

		return session;
	}

}
