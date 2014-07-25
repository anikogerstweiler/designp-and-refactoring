package logger.implementor;

public class StdOutLoggerImplementor implements LoggerImplementor {

	@Override
	public void log(String message) {
		//TODO: add timestamp
		System.out.println(message);
	}

}
