package logger.implementor;

import logger.Logger;

public class ImmediateLogger extends Logger {

	public ImmediateLogger(LoggerImplementor implementor) {
		super(implementor);
	}

	@Override
	public void log(String message) {
		implementor.log(message);
	}

}
