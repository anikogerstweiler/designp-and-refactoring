package main;

public interface Fifo<T> {

	void put(T t);
	
	T pop();
}
