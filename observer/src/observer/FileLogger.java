package observer;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * ORIGINAL CODE
 * public void log(String message) {
 * try(PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE_NAME, true))) {
			writer.println(message);
	} catch (IOException e) {
			e.printStackTrace();
	}
 * 
 * PROBLEM: create new PrintWriter instance every log, open it and close after writing
 * */
public class FileLogger implements Logger {

	private static final String LOG_FILE_NAME = "log.txt";
	
	private PrintWriter writer = null;
	
	@Override
	public void log(String message) {
		try {
			if (writer == null)
				writer = new PrintWriter(new FileWriter(LOG_FILE_NAME, true));
			
			writer.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		writer.close();
		
	}
}
