package solution1;

import java.util.List;

public class FlushHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (allSameColor(fiveCards)) {
			handValue = FLUSH_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		return handValue;
	}

}
