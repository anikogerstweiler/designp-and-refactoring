package solution1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Integer> getPrimes(int count) {
		int primeCount = 0;
		int current = 2;
		List<Integer> result = new ArrayList<Integer>();

		while (primeCount < count) {
			if (isPrime(current)) {
				result.add(current);
				primeCount++;
			}

			current++;
		}

		return result;
	}

	private static boolean isPrime(int number) {
		return numberOfDividors(number) == 0;
	}

	private static int numberOfDividors(int number) {
		int numberOfDivisors = 0;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				numberOfDivisors++;
			}
		}
		return numberOfDivisors;
	}

}
