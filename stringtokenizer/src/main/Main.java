package main;

import stringtokenizer.StringTokenizerAdapter;

public class Main {

	public static void main(String[] args) {
		StringTokenizerAdapter adapter = new StringTokenizerAdapter("this is a test");
		for (String s : adapter) {
			System.out.print(s);
		}
	}

}
