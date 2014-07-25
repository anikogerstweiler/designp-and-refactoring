package exercise3;

public class Main {

	// input format: codeFromAlphanumericCharacters[-characterFlags][-ordinal]

	public static String code(String input) {
		String[] parts = input.split("-");

		return parts[0];
	}

	public static String suffix(String input) {
		String[] parts = input.split("-");

		if (parts.length == 1) {
			return "";
		}

		if (parts.length == 2) {
			if (parts[1].matches("^[0-9]+$")) {
				return "";
			} else {
				return parts[1];
			}
		}

		if (parts.length == 3) {
			return parts[1];
		}

		return "";
	}

	public static int ordinal(String input) {
		String[] parts = input.split("-");

		if (parts.length == 1) {
			return 0;
		}

		if (parts.length == 2) {
			if (parts[1].matches("^[0-9]+$")) {
				return Integer.valueOf(parts[1]);
			} else {
				return 0;
			}
		}

		if (parts.length == 3) {
			return Integer.valueOf(parts[2]);
		}

		return 0;
	}
}
