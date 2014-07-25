package encryptor;

import java.util.Arrays;

public class SimpleEncryptor extends Encryptor {

	@Override
	protected byte[] getKey(int size) {
		byte[] key = new byte[size];
		Arrays.fill(key , (byte)0);
		
		return key; 
	}

}
