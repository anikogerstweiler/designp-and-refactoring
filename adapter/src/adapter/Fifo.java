package adapter;

public interface Fifo<T> {
	
	void put(T t);
	
	T pop();
}
