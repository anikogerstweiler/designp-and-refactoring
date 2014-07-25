package observer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger {

	private static final String LOG_FILE_NAME = "log.txt";
	
	@Override
	public void log(String message) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE_NAME, true))) {
			writer.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
