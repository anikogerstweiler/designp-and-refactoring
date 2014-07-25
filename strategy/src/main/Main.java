package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

import strategy.BinaryStrategy;
import strategy.GuessWhat;
import strategy.Strategy;
import strategy.GuessWhat.GuessResult;

public class Main {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Strategy binaryStrategy = new BinaryStrategy();
		GuessWhat guessWhat = new GuessWhat(binaryStrategy);
		
		int guess = guessWhat.getInitialGuess();
		GuessResult guessResult;
		while ((guessResult = makeGuess(guess)) != GuessResult.EQ) {
			guess = guessWhat.guess(guessResult);
		}
	}
	
	private static GuessResult makeGuess(int guess) throws IOException {
		System.out.println("My guess is: " + guess + " the number is greater, less than or equal?");
		String answer = br.readLine();
		GuessResult guessResult;
		switch (answer) {
		case "G":
			guessResult = GuessResult.GT;
			break;
		case "L":
			guessResult = GuessResult.LT;
			break;
		case "E":
			guessResult = GuessResult.EQ;
			break;
		default:
			throw new InputMismatchException("Invalid miccs-maccs");
		}
		
		return guessResult;
	}

}
