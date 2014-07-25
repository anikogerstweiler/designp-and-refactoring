package solution1;

import java.util.List;

public class StraightHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (isStraight(fiveCards)) {
			handValue = STRAIGHT_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		return handValue;
	}

}
