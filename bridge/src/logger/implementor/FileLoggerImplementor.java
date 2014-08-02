package logger.implementor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLoggerImplementor implements LoggerImplementor, AutoCloseable {

	private PrintWriter printWriter;

	public FileLoggerImplementor(File file) throws IOException {
		printWriter = new PrintWriter(new FileWriter(file, true));
	}

	@Override
	public void log(String message) {
		printWriter.println(message);
	}

	@Override
	public void close() {
		printWriter.close();
	}


}
