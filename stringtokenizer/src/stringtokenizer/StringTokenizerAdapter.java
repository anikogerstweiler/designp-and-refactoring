package stringtokenizer;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerAdapter extends StringTokenizer implements Iterable<String> {

	private final class StringTokenizerIterator implements Iterator<String> {

		@Override
		public boolean hasNext() {
			return hasMoreTokens();
		}

		@Override
		public String next() {
			return nextToken();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Not implemented yet");
		}
	}
	
	public StringTokenizerAdapter(String str) {
		super(str);
	}
	
	public StringTokenizerAdapter(String str, String delimiter) {
		super(str, delimiter);
	}

	@Override
	public Iterator<String> iterator() {
		return new StringTokenizerIterator();
	}

	

}
