package solution1;

import java.util.List;

public class DrillHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (getMaxCountOfSameRank(fiveCards) == DRILL_COUNT) {
			handValue = DRILL_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}

		return handValue;
	}

}
