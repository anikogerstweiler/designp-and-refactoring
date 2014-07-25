package logger.implementor;

import java.util.ArrayList;
import java.util.List;

import logger.Logger;

public class BufferedLogger extends Logger {

	public BufferedLogger(LoggerImplementor implementor) {
		super(implementor);
	}

	private List<String> messages = new ArrayList<>();
	
	@Override
	public void log(String message) {
		messages.add(message);
	}
	
	public void flush() {
		for (String message : messages) {
			implementor.log(message);
		}
		
		messages.clear();
	}

}
