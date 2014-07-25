package main;

import java.util.ArrayList;

public class FifoImpl<T> implements Fifo<T> {

	private ArrayList<T> list = new ArrayList<T>(1000);

	public FifoImpl() {
	}

	@Override
	public void put(T t) {
		list.add(t);
	}

	@Override
	public T pop() {
		if (!list.isEmpty()) {
			return list.remove(0);
		}
		return null;
	}
}
