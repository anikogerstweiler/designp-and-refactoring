package iterator;

import java.util.Iterator;

public class Aggregate implements Iterable<Integer> {
	
	private static final int ARRAY_SIZE = 1024;
	
	private int[] elements = new int[ARRAY_SIZE];
	
	private int validElementCounter = 0;
	
	private boolean removeCalled = false;
	
	private final class AgggregateIterator implements Iterator<Integer> {

		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < validElementCounter;
		}

		@Override
		public Integer next() {
			removeCalled = false;
			int element = get(index);
			index++;
			
			return element;
		}

		@Override
		public void remove() {
			if (index == 0) {
				throw new IllegalStateException("next() must be invoked before remove()");
			}
			
			if (removeCalled) {
				throw new IllegalStateException("remove() cannot invoked multiple times");
			}
			
			removeCalled = true;
			index--;
			Aggregate.this.remove(index);
		}
		
	}
	
	public void add(int element) {
		if (validElementCounter >= ARRAY_SIZE) {
			throw new IllegalStateException("You cannot add elements to a full aggregate");
		}
		
		elements[validElementCounter] = element;
		validElementCounter++;
	}
	
	public int get(int index) {
		if (index < 0 || index >= validElementCounter) {
			throw new IndexOutOfBoundsException("Index must be between 0 and " + ARRAY_SIZE);
		}
		
		return elements[index];
	}
	
	public int remove(int index) {
		if (index < 0 || index >= validElementCounter) {
			throw new IndexOutOfBoundsException("Index must be between 0 and " + ARRAY_SIZE);
		}
		int element = elements[index];
		
		for (int i = index; i < validElementCounter - 1; i++) {
			elements[i] =  elements[i + 1];
		}
		
		validElementCounter--;
		
		return element;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new AgggregateIterator();
	}
	
	
}
