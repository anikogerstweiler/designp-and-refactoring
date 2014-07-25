package observer;

public class StdOutLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
