package logger.implementor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLoggerImplementor implements LoggerImplementor {

	private File file;
	
	public FileLoggerImplementor(File file) {
		this.file = file;
	}
	
	@Override
	public void log(String message) {
		//TODO: ne nyissuk zarjuk minden sor irasanal a writert!
		try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
			pw.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
