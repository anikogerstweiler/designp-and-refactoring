package strategy;

public class BinaryStrategy implements Strategy{

	@Override
	public int guess(int min, int max) {
		return (min + max) / 2;
	}

}
