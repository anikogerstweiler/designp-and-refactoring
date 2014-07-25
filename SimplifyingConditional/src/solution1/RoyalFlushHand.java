package solution1;

import java.util.List;

public class RoyalFlushHand extends Hand {

	@Override
	protected int evaluate(List<Card> fiveCards) {
		int handValue;;
		
		if (isStraight(fiveCards) && allSameColor(fiveCards) && getHighestRank(fiveCards) == Value.ACE.ordinal()) {
			handValue = ROYAL_FLUSH_VALUE;
		} else {
			handValue = next.evaluate(fiveCards);
		}
		
		return handValue;
	}
	
	

}
