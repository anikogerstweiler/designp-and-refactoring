package adapter;

import java.util.ArrayList;

import adapter.Fifo;

public class FifoClassAdapter<T> extends ArrayList<T> implements Fifo<T>{

	private static final long serialVersionUID = 1L;

	@Override
	public void put(T t) {
		add(t);
	}

	@Override
	public T pop() {
		return remove(0);
	}

}
