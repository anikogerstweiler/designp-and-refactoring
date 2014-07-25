package solution1;

public class Card implements Comparable<Card> {

	private Color color;

	private Value value;

	public Card(Color color, Value value) {
		super();
		this.color = color;
		this.value = value;
	}

	public int getRank() {
		return value.ordinal();
	}

	public Color getColor() {
		return color;
	}

	public Value getValue() {
		return value;
	}

	@Override
	public int compareTo(Card o) {
		return value.compareTo(o.value);
	}

	static boolean isSameColor(Card card, Card card2) {
		return card.getColor() != card2.getColor();
	}

	static boolean isNextValue(Card card1, Card card2) {
		return card1.getRank() != card2.getRank() + 1;
	}

}
