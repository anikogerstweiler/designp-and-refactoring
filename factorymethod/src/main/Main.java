package main;

import java.io.IOException;

import encryptor.Encryptor;
import encryptor.RandomEncryptor;

public class Main {

	public static void main(String[] args) throws IOException {
		Encryptor encryptor = new RandomEncryptor();
		encryptor.encrypt("pókmalac");
		System.out.println(encryptor.decrypt());

	}

}
