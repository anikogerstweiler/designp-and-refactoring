package solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Hand {

	protected static final int PAIR_COUNT = 2;
	protected static final int DRILL_COUNT = 3;
	protected static final int POKER_COUNT = 4;
	protected static final int PAIR_VALUE = 20000;
	protected static final int TWO_PAIRS_VALUE = 30000;
	protected static final int DRILL_VALUE = 40000;
	protected static final int STRAIGHT_VALUE = 50000;
	protected static final int FLUSH_VALUE = 60000;
	protected static final int FULL_HOUSE_VALUE = 70000;
	protected static final int POKER = 80000;
	protected static final int STRAIGHT_FLUSH_VALUE = 90000;
	protected static final int ROYAL_FLUSH_VALUE = 100000;
	protected List<Card> cards;
	
	
	private static Hand chain;
	protected Hand next;
	
	static {
		Hand royalFlush = new RoyalFlushHand();
		Hand straightFlush = new StraightFlushHand();
		Hand poker = new PokerHand();
		Hand fullHouse = new FullHouseHand();
		Hand flush = new FlushHand();
		Hand straight = new StraightHand();
		Hand drill = new DrillHand();
		Hand twoPairs = new TwoPairHand();
		Hand pair = new PairHand();
		
		royalFlush.setNext(straightFlush);
		straightFlush.setNext(poker);
		poker.setNext(fullHouse);
		fullHouse.setNext(flush);
		flush.setNext(straight);
		straight.setNext(drill);
		drill.setNext(twoPairs);
		twoPairs.setNext(pair);
		
		chain = royalFlush;
	}
	
	protected Hand getNext() {
		return next;
	}

	public void setNext(Hand next) {
		this.next = next;
	}

	protected static boolean allSameColor(List<Card> cards) {
		if (cards.isEmpty()) {
			return true;
		}

		for (Card card : cards) {
			if (!Card.isSameColor(card, cards.get(0))) {
				return false;
			}
		}

		return true;
	}

	protected static boolean isStraight(List<Card> cards) {
		if (cards.isEmpty()) {
			throw new IllegalArgumentException(
					"Parameter 'cards' cannot be empty.");
		}

		Collections.sort(cards);

		for (int i = 1; i < cards.size(); i++) {
			if (!Card.isNextValue(cards.get(i), cards.get(i - 1))) {
				return false;
			}
		}

		return true;
	}

	protected abstract int evaluate(List<Card> fiveCards);

	private static int evaluateFiveCards(List<Card> fiveCards) {
		if (fiveCards.size() != 5) {
			throw new IllegalArgumentException(
					"Parameter 'fiveCards' should contain exactly five cards.");
		}
		
		return chain.evaluate(fiveCards);

	}
	
	protected static int getSecondMaxCountOfSameRank(List<Card> fiveCards) {
		List<Integer> countsOfSameRank = getCountsOfSameRank(fiveCards);
		
		return countsOfSameRank.get(countsOfSameRank.size() - 2);
	}

	protected static List<Integer> getCountsOfSameRank(List<Card> fiveCards) {
		List<Integer> countsOfSameRank = new ArrayList<Integer>(13);
		for (int i = 0; i < Value.values().length; i++) {
			countsOfSameRank.add(0);
		}

		for (int i = 0; i < fiveCards.size(); i++) {
			countsOfSameRank.set(fiveCards.get(i).getRank(),
			countsOfSameRank.get(fiveCards.get(i).getRank()) + 1);
		}
		
		Collections.sort(countsOfSameRank);
		return countsOfSameRank;
	}

	protected static int getMaxCountOfSameRank(List<Card> fiveCards) {
		List<Integer> countsOfSameRank = getCountsOfSameRank(fiveCards);
		
		return countsOfSameRank.get(countsOfSameRank.size() - 1);
	}

	protected static int getHighestRank(List<Card> fiveCards) {
		Collections.sort(fiveCards);
		
		return fiveCards.get(fiveCards.size() - 1).getRank();
	}

	public static int findMaxValueSubset(Card card1, Card card2, List<Card> cardsOnTable) {
		if (cardsOnTable.size() != 5) {
			throw new IllegalArgumentException(
					"Parameter 'cardsOnTable' should contain exactly five cards.");
		}

		List<Card> allCards = new ArrayList<Card>();
		allCards.addAll(cardsOnTable);
		allCards.add(card1);
		allCards.add(card2);
		
		int allSize = allCards.size();

		int maxValue = 0;
		for (int i = 0; i < allSize; i++) {
			for (int j = i; j < allSize - 1; j++) {
				List<Card> allCardsCopy = new ArrayList<Card>(allCards);
				allCardsCopy.remove(i);
				allCardsCopy.remove(j);

				int value = evaluateFiveCards(allCardsCopy);
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}

		return maxValue;
	}
}
