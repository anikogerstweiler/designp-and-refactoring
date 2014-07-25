package solution1;

import java.util.List;

public class FullHouseHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (getMaxCountOfSameRank(fiveCards) == DRILL_COUNT
				&& getSecondMaxCountOfSameRank(fiveCards) == PAIR_COUNT) {
			handValue = FULL_HOUSE_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		return handValue;
	}

}
