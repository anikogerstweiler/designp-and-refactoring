package strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

	private Random random = new Random();
	
	@Override
	public int guess(int min, int max) {
		int guess;
		
		if (max == min) {
			guess = min;
		} else {
			guess = random.nextInt(max - min) + min;
		}
		
		return guess;
	}

}
