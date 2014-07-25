package solution1;

import java.util.List;

public class PairHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;

		if (getMaxCountOfSameRank(fiveCards) == PAIR_COUNT) {
			handValue = PAIR_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}

		return handValue;
	}

}
