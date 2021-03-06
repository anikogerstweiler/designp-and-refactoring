package solution1;

import java.util.List;

public class StraightFlushHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;
		
		if (isStraight(fiveCards) && allSameColor(fiveCards)) {
			handValue = STRAIGHT_FLUSH_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		return handValue;
	}

}
