package main;

public class FifoProxy<T> implements Fifo<T> {

	private Fifo<T> fifo;

	private Fifo<T> getFifo() {
		if (fifo == null) {
			fifo = new FifoImpl<T>();
		}
		return fifo;
	}

	@Override
	public void put(T t) {
		getFifo().put(t);

	}

	@Override
	public T pop() {
		return getFifo().pop();
	}



}
