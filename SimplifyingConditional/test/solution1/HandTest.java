package solution1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HandTest {

	@Test
	public void testRoyalFlush() {
		Card h1 = new Card(Color.SPADES, Value.ACE);
		Card h2 = new Card(Color.DIAMONDS, Value.ACE);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.ACE));
		table.add(new Card(Color.DIAMONDS, Value.KING));
		table.add(new Card(Color.DIAMONDS, Value.QUEEN));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.N10));

		Assert.assertEquals(100000, Hand.findMaxValueSubset(h1, h2, table));
	}

	@Test
	public void testStraightFlush() {
		Card h1 = new Card(Color.SPADES, Value.ACE);
		Card h2 = new Card(Color.DIAMONDS, Value.KING);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.ACE));
		table.add(new Card(Color.DIAMONDS, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.QUEEN));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.N10));

		Assert.assertEquals(90000, Hand.findMaxValueSubset(h1, h2, table));
	}

	@Test
	public void testFourOfKind() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.HEARTS, Value.N2);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N2));
		table.add(new Card(Color.SPADES, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.N2));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(80000, Hand.findMaxValueSubset(h1, h2, table));
	}

	@Test
	public void testFull() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.DIAMONDS, Value.N3);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N2));
		table.add(new Card(Color.SPADES, Value.N3));
		table.add(new Card(Color.DIAMONDS, Value.N2));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(70000, Hand.findMaxValueSubset(h1, h2, table));
	}
	
	@Test
	public void testFlush() {
		Card h1 = new Card(Color.SPADES, Value.ACE);
		Card h2 = new Card(Color.DIAMONDS, Value.KING);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.ACE));
		table.add(new Card(Color.DIAMONDS, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.QUEEN));
		table.add(new Card(Color.DIAMONDS, Value.N2));
		table.add(new Card(Color.DIAMONDS, Value.N10));

		Assert.assertEquals(60000, Hand.findMaxValueSubset(h1, h2, table));
	}

	@Test
	public void testStraight() {
		Card h1 = new Card(Color.SPADES, Value.ACE);
		Card h2 = new Card(Color.DIAMONDS, Value.KING);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.ACE));
		table.add(new Card(Color.DIAMONDS, Value.N9));
		table.add(new Card(Color.HEARTS, Value.QUEEN));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.SPADES, Value.N10));

		Assert.assertEquals(50000, Hand.findMaxValueSubset(h1, h2, table));
	}
	
	@Test
	public void testThreeOfKind() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.HEARTS, Value.N2);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N7));
		table.add(new Card(Color.SPADES, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.N2));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(40000, Hand.findMaxValueSubset(h1, h2, table));
	}
	
	@Test
	public void testTwoPairs() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.HEARTS, Value.N2);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N7));
		table.add(new Card(Color.SPADES, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.N9));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(30000, Hand.findMaxValueSubset(h1, h2, table));
	}
	
	@Test
	public void testPair() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.HEARTS, Value.N2);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N7));
		table.add(new Card(Color.SPADES, Value.N3));
		table.add(new Card(Color.DIAMONDS, Value.N6));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(20000, Hand.findMaxValueSubset(h1, h2, table));
	}
	
	@Test
	public void testHighCard() {
		Card h1 = new Card(Color.SPADES, Value.N2);
		Card h2 = new Card(Color.HEARTS, Value.N4);

		List<Card> table = new ArrayList<Card>();
		table.add(new Card(Color.CLUBS, Value.N7));
		table.add(new Card(Color.SPADES, Value.N3));
		table.add(new Card(Color.DIAMONDS, Value.N6));
		table.add(new Card(Color.DIAMONDS, Value.JACK));
		table.add(new Card(Color.DIAMONDS, Value.KING));

		Assert.assertEquals(11, Hand.findMaxValueSubset(h1, h2, table));
	}
}
