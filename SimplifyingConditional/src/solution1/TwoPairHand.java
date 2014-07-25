package solution1;

import java.util.List;

public class TwoPairHand extends Hand{

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (getMaxCountOfSameRank(fiveCards) == PAIR_COUNT && getSecondMaxCountOfSameRank(fiveCards) == PAIR_COUNT) {
			handValue = TWO_PAIRS_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}

		return handValue;
	}

}
