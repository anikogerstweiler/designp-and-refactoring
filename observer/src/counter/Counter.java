package counter;

import java.util.ArrayList;
import java.util.List;

import observer.Logger;

public class Counter implements Runnable {

	private List<Logger> loggers = new ArrayList<>();
	
	private int period;
	
	public Counter(int period) {
		this.period = period;
	}
	
	public void addLogger(Logger logger) {
		loggers.add(logger);
	}
	
	public void removeLogger(Logger logger) {
		loggers.remove(logger);
	}
	
	public void notifyLoggers(int sequence) {
		for (Logger logger : loggers) {
			logger.log("period: " + period + " , current state: " + sequence);
		}
	}

	@Override
	public void run() {
		int sequence = 0;
		while (sequence < 10) {
			try {
				Thread.sleep(period);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sequence++;
			notifyLoggers(sequence);
		}
		
	}

}
