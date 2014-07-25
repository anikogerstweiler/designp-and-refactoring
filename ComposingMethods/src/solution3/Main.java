package solution3;

public class Main {

	// input format: codeFromAlphanumericCharacters[-characterFlags][-ordinal]

	public static String code(String input) {
		return new InputParser(input).getCode();
	}

	public static String suffix(String input) {
		return new InputParser(input).getSuffix();
	}

	public static int ordinal(String input) {
		return new InputParser(input).getOrdinal();
	}
}
