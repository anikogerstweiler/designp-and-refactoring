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

		encodeMessage(rawMessage, key, encryptedMessage);

		writeIntoFile(KEY_FILE_NAME, key);

		writeIntoFile(ENCRYPTED_FILE_NAME, encryptedMessage);
	}

	private void writeIntoFile(String fileName, byte[] content) throws IOException,
			FileNotFoundException {
		try(FileOutputStream outputStream = new FileOutputStream(fileName)) {
			outputStream.write(content);
		}
	}

	private void encodeMessage(byte[] rawMessage, byte[] key,
			byte[] encryptedMessage) {
		for (int i = 0; i < rawMessage.length; i++) {
			encryptedMessage[i] = (byte) (rawMessage[i] ^ key[i]);
		}
	}

	public String decrypt() throws FileNotFoundException, IOException {
		byte[] key = readFromFile(KEY_FILE_NAME);

		byte[] encryptedMessage = readFromFile(ENCRYPTED_FILE_NAME);

		byte[] rawMessage = new byte[encryptedMessage.length];
		encodeMessage(encryptedMessage, key, rawMessage);

		return new String(rawMessage);
	}

	private byte[] readFromFile(String fileName) throws IOException, FileNotFoundException {
		byte[] content;
		try(FileInputStream inputStream = new FileInputStream(fileName)) {
			byte[] buffer = new byte[BUFFER_SIZE];
			int count = inputStream.read(buffer);
			content = Arrays.copyOf(buffer, count);
		}
		return content;
	}

	//Product a byte[]
	protected abstract byte[] getKey(int size);
}
