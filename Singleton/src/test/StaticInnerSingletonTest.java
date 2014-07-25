package test;

import singleton.StaticInnerSingleton;

public class StaticInnerSingletonTest {

	public static void main(String args[]) throws ClassNotFoundException {
		StaticInnerSingleton.sfoo();
		System.out.println("Class initialized");
		StaticInnerSingleton.getInstance();
		System.out.println("Getter called");
	}

}
