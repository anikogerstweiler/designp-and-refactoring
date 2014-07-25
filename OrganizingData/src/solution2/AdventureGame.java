package solution2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution2.scene.Scene;
import solution2.scene.WelcomeScene;

public class AdventureGame {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException {
		Scene scene = new WelcomeScene();

		while (!scene.exit()) {
			System.out.print(" " + scene.question() + "\n");
			scene = scene.next(readAnswer());
		}
	}

	public static boolean readAnswer() throws IOException {
		System.out.print("Y/N: ");
		String answer = reader.readLine();
		return answer.toUpperCase().startsWith("Y");
	}
}
