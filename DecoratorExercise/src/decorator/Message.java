package decorator;

import java.util.Date;

public class Message {

	private String sender;

	private Date timestamp;

	private String message;

	public Message(String sender, Date timestamp, String message) {
		super();

		this.sender = checkNotNull(sender, "Sender cannot be null");
		this.timestamp = checkNotNull(timestamp, "Timestamp cannot be null");
		this.message = checkNotNull(message, "Message cannot be null");
	}

	private <T> T checkNotNull(T input, String errorMessage) {
		if (input == null) {
			throw new IllegalArgumentException(errorMessage);
		}

		return input;
	}

	public String getSender() {
		return sender;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Message [sender=" + sender + ", timestamp=" + timestamp + ", message=" + message + "]";
	}

	public void setMessage(String text) {
		message = text;
	}

}
