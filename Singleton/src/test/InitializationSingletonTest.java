package test;

import singleton.InitializationSingleton;

public class InitializationSingletonTest {

	public static void main(String args[]) throws ClassNotFoundException {
		InitializationSingleton.sfoo();
		System.out.println("Class initialized");
		InitializationSingleton.getInstance();
		System.out.println("Getter called");
	}

}
