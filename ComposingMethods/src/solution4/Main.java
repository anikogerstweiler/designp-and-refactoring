package solution4;

public class Main {

	public static int fibonacci(int ordinal) {
		if (ordinal <= 2) {
			return 1;
		}
		return fibonacci(ordinal - 1) + fibonacci(ordinal - 2);
	}

}
