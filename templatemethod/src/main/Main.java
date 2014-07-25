package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import templatemethod.IntegerSorter;
import templatemethod.StringSorter;

public class Main {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			integerList.add(i);
		}
		
		Collections.shuffle(integerList);
		System.out.println(integerList);
		
		new IntegerSorter().sort(integerList);
		System.out.println(integerList);
		
		
		List<String> strings = new ArrayList<>();
		strings.add("alma");
		strings.add("korte");
		strings.add("bela");
		
		Collections.shuffle(strings);
		System.out.println(strings);
		new StringSorter().sort(strings);
		System.out.println(strings);
	}

}
