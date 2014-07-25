package decorator;

public class ObsceneFilterDecorator extends Decorator {

	public ObsceneFilterDecorator(Chat chat) {
		super(chat);
	}
	
	@Override
	public void send(Message message) {
		String text = message.getMessage();
		text = text.replace("fuck", "f**k");
		message.setMessage(text);
		
		chat.send(message);
	}

}
