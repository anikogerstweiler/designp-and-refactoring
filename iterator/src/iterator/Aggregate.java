package iterator;

import java.util.Iterator;

public class Aggregate implements Iterable<Integer> {
	
	private static final int ARRAY_SIZE = 1024;
	
	private int[] elements = new int[ARRAY_SIZE];
	
	private int validElementCounter = 0;
	
	private boolean removeCalled = false;
	
	private final class AggregateIterator implements Iterator<Integer> {

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
			
			handleMultipleInvocation();
			
			removeCalled = true;
			index--;
			Aggregate.this.remove(index);
		}

		private void handleMultipleInvocation() {
			if (removeCalled) {
				throw new IllegalStateException("remove() cannot invoked multiple times");
			}
		}
	}
	
	public void add(int element) {
		checkAggregateIsFull();
		
		elements[validElementCounter] = element;
		validElementCounter++;
	}

	private void checkAggregateIsFull() {
		if (validElementCounter >= ARRAY_SIZE) {
			throw new IllegalStateException("You cannot add elements to a full aggregate");
		}
	}
	
	public int get(int index) {
		validateIndex(index);
		
		return elements[index];
	}

	private void validateIndex(int index) {
		if (index < 0 || index >= validElementCounter) {
			throw new IndexOutOfBoundsException("Index must be between 0 and " + ARRAY_SIZE);
		}
	}
	
	public int remove(int index) {
		validateIndex(index);
		
		int element = elements[index];
		
		shiftElements(index);
		
		validElementCounter--;
		
		return element;
	}

	private void shiftElements(int index) {
		for (int i = index; i < validElementCounter - 1; i++) {
			elements[i] =  elements[i + 1];
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new AggregateIterator();
	}
}
