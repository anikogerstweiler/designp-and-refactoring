package test;

import singleton.SynchronizedGetterSingleton;

public class DoubleCheckedLockingSingletonTest {

	public static void main(String args[]) throws ClassNotFoundException {
		SynchronizedGetterSingleton.sfoo();
		System.out.println("Class initialized");
		SynchronizedGetterSingleton.getInstance();
		System.out.println("Getter called");
	}
}
