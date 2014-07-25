package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

	private List<Card> cards;

	public Hand(Card card1, Card card2) {
		super();
		cards = new ArrayList<Card>();
		cards.add(card1);
		cards.add(card2);
	}

	private static boolean allSameColor(List<Card> cards) {
		if (cards.isEmpty()) {
			return true;
		}

		for (Card card : cards) {
			if (card.getColor() != cards.get(0).getColor()) {
				return false;
			}
		}

		return true;
	}

	private static boolean isStraight(List<Card> cards) {
		if (cards.isEmpty()) {
			throw new IllegalArgumentException("Parameter 'cards' cannot be empty.");
		}

		Collections.sort(cards);

		for (int i = 1; i < cards.size(); i++) {
			if (cards.get(i).getRank() != cards.get(i - 1).getRank() + 1) {
				return false;
			}
		}

		return true;
	}

	private static int evaluate(List<Card> fiveCards) {
		if (fiveCards.size() != 5) {
			throw new IllegalArgumentException("Parameter 'fiveCards' should contain exactly five cards.");
		}

		boolean finished = false;
		int ret = 0;

		// highestRank start
		Collections.sort(fiveCards);
		int temp3 = fiveCards.get(fiveCards.size() - 1).getRank();
		// highestRank end

		if (!finished && isStraight(fiveCards) && allSameColor(fiveCards) && temp3 == 12) {
			ret = 100000;
			finished = true;
		}

		if (!finished && isStraight(fiveCards) && allSameColor(fiveCards)) {
			ret = 90000;
			finished = true;
		}

		if (!finished) {
			// maxCountOfSameRank start
			List<Integer> countsOfSameRank = new ArrayList<Integer>(13);
			for (int i = 0; i < Value.values().length; i++) {
				countsOfSameRank.add(0);
			}

			for (int i = 0; i < fiveCards.size(); i++) {
				countsOfSameRank.set(fiveCards.get(i).getRank(), countsOfSameRank.get(fiveCards.get(i).getRank()) + 1);
			}
			Collections.sort(countsOfSameRank);
			int temp = countsOfSameRank.get(countsOfSameRank.size() - 1);
			// maxCountOfSameRank end

			if (temp == 4) {
				finished = true;
				ret = 80000;
			}

			// secondMaxCountOfSameRank start
			List<Integer> countsOfSameRank1 = new ArrayList<Integer>(13);
			for (int i = 0; i < Value.values().length; i++) {
				countsOfSameRank1.add(0);
			}

			for (int i = 0; i < fiveCards.size(); i++) {
				countsOfSameRank1.set(fiveCards.get(i).getRank(), countsOfSameRank1.get(fiveCards.get(i).getRank()) + 1);
			}
			Collections.sort(countsOfSameRank1);
			int temp2 = countsOfSameRank1.get(countsOfSameRank1.size() - 2);
			// secondMaxCountOfSameRank end

			if (!finished && temp == 3 && temp2 == 2) {
				finished = true;
				ret = 70000;
			}

			if (!finished && allSameColor(fiveCards)) {
				finished = true;
				ret = 60000;
			}

			if (!finished && isStraight(fiveCards)) {
				finished = true;
				ret = 50000;
			}

			if (!finished && temp == 3) {
				finished = true;
				ret = 40000;
			}

			if (!finished && temp == 2 && temp2 == 2) {
				finished = true;
				ret = 30000;
			}

			if (!finished && temp == 2) {
				finished = true;
				ret = 20000;
			}
		}

		if (!finished) {
			return temp3;
		} else {
			return ret;
		}
	}

	public int findMaxValueSubset(List<Card> cardsOnTable) {
		if (cardsOnTable.size() != 5) {
			throw new IllegalArgumentException("Parameter 'cardsOnTable' should contain exactly five cards.");
		}

		int allSize = cardsOnTable.size() + cards.size();

		List<Card> allCards = new ArrayList<Card>();
		allCards.addAll(cardsOnTable);
		allCards.addAll(cards);

		int maxValue = 0;
		for (int i = 0; i < allSize; i++) {
			for (int j = i; j < allSize - 1; j++) {
				List<Card> allCardsCopy = new ArrayList<Card>(allCards);
				allCardsCopy.remove(i);
				allCardsCopy.remove(j);

				int value = evaluate(allCardsCopy);
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}

		return maxValue;
	}
}
