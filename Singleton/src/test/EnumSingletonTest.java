package test;

import singleton.EnumSingleton;

public class EnumSingletonTest {

	public static void main(String args[]) throws ClassNotFoundException {
		EnumSingleton.sfoo();
		System.out.println("Class initialized");
		EnumSingleton.INSTANCE.foo();
		System.out.println("Getter called");
	}
}
