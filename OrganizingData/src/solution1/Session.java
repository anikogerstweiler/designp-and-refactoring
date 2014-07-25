package solution1;

import java.util.UUID;

public class Session {

	private User user;

	private String sessionId;

	public Session(User user) {
		super();
		this.user = user;
		this.sessionId = UUID.randomUUID().toString();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
