package adapter;

import java.util.ArrayList;
import java.util.List;

public class FifoObjectAdapter<T> implements Fifo<T> {

	private List<T> elements = new ArrayList<>();
	
	@Override
	public void put(T t) {
		elements.add(t);
	}

	@Override
	public T pop() {
		return elements.remove(0);
	}

}
