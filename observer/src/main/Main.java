package main;

import observer.FileLogger;
import observer.Logger;
import observer.StdOutLogger;
import counter.Counter;

public class Main {

	public static void main(String[] args) {
		Counter counter2sec = new Counter(2000);
		Counter counter3sec = new Counter(3000);
		
		Logger stdOutLogger = new StdOutLogger();
		Logger fileLogger = new FileLogger();
		
		counter2sec.addLogger(stdOutLogger);
		counter2sec.addLogger(fileLogger);
		
		counter3sec.addLogger(stdOutLogger);
		counter3sec.addLogger(fileLogger);
		
		Thread counter2secThread = new Thread(counter2sec);
		Thread counter3secThread = new Thread(counter3sec);
		
		counter2secThread.start();
		counter3secThread.start();
		
		try {
			counter2secThread.join();
			counter3secThread.join();
			
			if (fileLogger instanceof FileLogger) {
				((FileLogger) fileLogger).close();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
