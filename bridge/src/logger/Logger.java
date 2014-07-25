package logger;

import logger.implementor.LoggerImplementor;

public abstract class Logger {
	
	protected LoggerImplementor implementor;
	
	public Logger(LoggerImplementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract void log(String message);
}
