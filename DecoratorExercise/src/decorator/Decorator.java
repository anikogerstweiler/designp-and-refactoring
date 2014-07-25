package decorator;

import java.util.concurrent.TimeUnit;

public abstract class Decorator implements Chat {

	protected Chat chat;
	
	public Decorator(Chat chat) {
		this.chat = chat;
	}
	
	@Override
	public void send(Message message) {
		chat.send(message);
	}

	@Override
	public Message receive(long timeout, TimeUnit unit)
			throws InterruptedException {
		return chat.receive(timeout, unit);
	}

}
