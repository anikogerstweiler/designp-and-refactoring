package decorator;

import java.util.concurrent.TimeUnit;

public class LoggerDecorator extends Decorator {

	public LoggerDecorator(Chat chat) {
		super(chat);
	}
	
	@Override
	public Message receive(long timeout, TimeUnit unit)
			throws InterruptedException {
		Message receivedMessage = chat.receive(timeout, unit);
		System.out.println("Receiving " + receivedMessage);
		
		return receivedMessage;
	}
	
	@Override
	public void send(Message message) {
		System.out.println("Message sent " + message);
		chat.send(message);
	}

}
