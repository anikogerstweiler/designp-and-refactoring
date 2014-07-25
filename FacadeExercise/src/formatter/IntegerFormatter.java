package formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class IntegerFormatter {
	private NumberFormat formatter;

	public IntegerFormatter() {
		this.formatter = NumberFormat.getIntegerInstance();
	}

	public String format(BigDecimal amount) {
		return formatter.format(amount);
	}
}
