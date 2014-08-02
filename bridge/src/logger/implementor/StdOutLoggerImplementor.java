package logger.implementor;

import java.sql.Timestamp;
import java.util.Date;

public class StdOutLoggerImplementor implements LoggerImplementor {

	@Override
	public void log(String message) {
		System.out.println(new Timestamp(new Date().getTime()) + " " + message);
	}

}
