package test;

import singleton.SynchronizedGetterSingleton;

public class SynchronizedGetterSingletonTest {

	public static void main() throws ClassNotFoundException {
		SynchronizedGetterSingleton.sfoo();
		System.out.println("Class initialized");
		SynchronizedGetterSingleton.getInstance();
		System.out.println("Getter called");
	}

}
