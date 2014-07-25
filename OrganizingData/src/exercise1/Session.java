package exercise1;

public class Session {

	private String user;

	private String sessionId;

	public Session(String user, String sessionId) {
		super();
		this.user = user;
		this.sessionId = sessionId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
