package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Integer> getPrimes(int count) {
		int primeCount = 0;
		int current = 2;
		List<Integer> ret = new ArrayList<Integer>();

		while (primeCount < count) {
			int numberOfDivisors = 0;
			for (int i = 2; i <= Math.sqrt(current); i++) {
				if (current % i == 0) {
					numberOfDivisors++;
				}
			}

			if (numberOfDivisors == 0) {
				ret.add(current);
				primeCount++;
			}

			current++;
		}

		return ret;
	}

}
