package test;

import singleton.StaticInitializerSingleton;

public class StaticInitializerSingletonTest {

	public static void main(String args[]) throws ClassNotFoundException {
		StaticInitializerSingleton.sfoo();
		System.out.println("Class initialized");
		StaticInitializerSingleton.getInstance();
		System.out.println("Getter called");
	}

}
