package encryptor;

import java.util.Random;

public class RandomEncryptor extends Encryptor {

	@Override
	protected byte[] getKey(int size) {
		byte[] key = new byte[size];
		
		Random random = new Random();
		random.nextBytes(key);
		
		return key; 
	}

}
