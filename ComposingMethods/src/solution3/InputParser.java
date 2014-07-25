package solution3;

public class InputParser {

	private static final String DELIMITER = "-";

	private static final String NOT_NUMERIC = "^[0-9]+$";

	private String code;
	
	private String suffix = "";
	
	private int ordinal = 0;
	
	public InputParser(String input) {
		String[] parts = input.split(DELIMITER);

		code = parts[0];
		
		if (parts.length == 2) {
			if (!parts[1].matches(NOT_NUMERIC)) {
				suffix = parts[1];
			} else {
				ordinal = Integer.valueOf(parts[1]);
			}
		} else if (parts.length == 3) {
			suffix = parts[1];
			ordinal = Integer.valueOf(parts[2]);
		}
	}

	public String getCode() {
		return code;
	}

	public String getSuffix() {
		return suffix;
	}

	public int getOrdinal() {
		return ordinal;
	}
}
