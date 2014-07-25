package strategy;

public class GuessWhat {
	
	private Strategy strategy;
	private int min = 0;
	private int max = 1023;
	private int lastGuess;
	
	public enum GuessResult {
		GT, LT, EQ;
	}

	public GuessWhat(Strategy strategy) {
		this.strategy = strategy;
	}
	
	private int guess() {
		lastGuess = strategy.guess(min, max);
		
		return lastGuess;
	}
	
	public int getInitialGuess() {
		return guess();
	}
	
	public int guess(GuessResult result) {
		switch (result) {
		case GT:
			min = lastGuess + 1;
			break;
		case LT:
			max = lastGuess - 1;
			break;
		}
		return guess();
	}
}
