package main;

import adapter.Fifo;
import adapter.FifoClassAdapter;
import adapter.FifoObjectAdapter;

public class Main {

	public static void main(String[] args) {
		{
			Fifo<Integer> fifo = new FifoObjectAdapter<>();

			for (int i = 0; i < 5; i++) {
				fifo.put(i);
			}

			for (int i = 0; i < 5; i++) {
				System.out.println(fifo.pop());
			}
		}

		{
			Fifo<Integer> fifo = new FifoClassAdapter<>();

			for (int i = 0; i < 5; i++) {
				fifo.put(i);
			}

			for (int i = 0; i < 5; i++) {
				System.out.println(fifo.pop());
			}
		}

	}

}
