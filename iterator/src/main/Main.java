package main;

import java.util.Iterator;

import iterator.Aggregate;

public class Main {

	public static void main(String[] args) {
		Aggregate aggregate = new Aggregate();
		
		for (int i = 0; i < 10; i++) {
			aggregate.add(i);
		}
		
		for (int element : aggregate) {
			System.out.println(element);
		}
		
		for (Iterator<Integer> i = aggregate.iterator(); i.hasNext(); ) {
			int element = i.next();
			if (element == 6) {
				i.remove();
			} else {
				System.out.println(element);
			}
		}
		
		for (int element : aggregate) {
			System.out.println(element);
		}

	}

}
