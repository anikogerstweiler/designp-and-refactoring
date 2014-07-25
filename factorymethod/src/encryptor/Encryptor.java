package encryptor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class Encryptor {
	
	private static final String KEY_FILE_NAME = "key.txt";
	private static final String ENCRYPTED_FILE_NAME = "enc.txt";
	private static final int BUFFER_SIZE = 1000;
	
	public void encrypt(String message) throws IOException {
		byte[] rawMessage = message.getBytes();
		byte[] key = getKey(rawMessage.length);
		byte[] encryptedMessage = new byte[rawMessage.length];
		
		for (int i = 0; i < rawMessage.length; i++) {
			encryptedMessage[i] = (byte) (rawMessage[i] ^ key[i]);
		}
		
		try(FileOutputStream keyStream = new FileOutputStream(KEY_FILE_NAME)) {
			keyStream.write(key);
		}
		
		try(FileOutputStream encryptedStream = new FileOutputStream(ENCRYPTED_FILE_NAME)) {
			encryptedStream.write(encryptedMessage);
		}
		
	}
	
	public String decrypt() throws FileNotFoundException, IOException {
		byte[] key;
		try(FileInputStream keyStream = new FileInputStream(KEY_FILE_NAME)) {
			byte[] buffer = new byte[BUFFER_SIZE];
			int count = keyStream.read(buffer);
			key = Arrays.copyOf(buffer, count);
		}
		
		byte[] encryptedMessage;
		try(FileInputStream encryptedStream = new FileInputStream(ENCRYPTED_FILE_NAME)) {
			byte[] buffer = new byte[BUFFER_SIZE];
			int count = encryptedStream.read(buffer);
			encryptedMessage = Arrays.copyOf(buffer, count);
		}
		
		byte[] rawMessage = new byte[encryptedMessage.length];
		for (int i = 0; i < encryptedMessage.length; i++) {
			rawMessage[i] = (byte) (encryptedMessage[i] ^ key[i]);
		}
		
		return new String(rawMessage);
	}
	
	//Product a byte[]
	protected abstract byte[] getKey(int size);
}
