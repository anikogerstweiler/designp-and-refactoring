package test;

import singleton.DoubleCheckedLockingSingleton;
import singleton.SynchronizedGetterSingleton;

public class PerformanceTest {

	public static void main(String args[]) throws ClassNotFoundException, InterruptedException {

		// -XX:-UseBiasedLocking -XX:BiasedLockingStartupDelay=0
		final int ITERATIONS = 1000000000;

		{
			long start = System.nanoTime();
			for (int i = 0; i < ITERATIONS; i++) {
				SynchronizedGetterSingleton.getInstance();
			}
			long length = System.nanoTime() - start;
			System.out.println(((double) length) / ITERATIONS);
		}

		{
			long start = System.nanoTime();
			for (int i = 0; i < ITERATIONS; i++) {
				DoubleCheckedLockingSingleton.getInstance();
			}
			long length = System.nanoTime() - start;
			System.out.println(((double) length) / ITERATIONS);
		}

	}

}
