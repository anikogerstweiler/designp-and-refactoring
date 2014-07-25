package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdventureGame {
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader reader = new BufferedReader(isr);

	public static void main(String args[]) throws IOException {
		Scene scene = new Scene();

		while (!scene.exit()) {
			System.out.print(" " + scene.question() + "\n");
			boolean answer = readAnswer();
			scene = scene.next(answer);
		}
	}

	public static boolean readAnswer() throws IOException {
		System.out.print("Y/N: ");
		String answer = reader.readLine();
		return answer.toUpperCase().startsWith("Y");
	}
}
