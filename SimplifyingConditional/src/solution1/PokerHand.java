package solution1;

import java.util.List;

public class PokerHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;
		
		if (getMaxCountOfSameRank(fiveCards) == POKER_COUNT) {
			handValue = POKER;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		return handValue;
	}

}
