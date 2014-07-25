package formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class PercentFormatter {
	private NumberFormat formatter;

	public PercentFormatter() {
		this.formatter = NumberFormat.getPercentInstance();
	}

	public String format(BigDecimal amount) {
		return formatter.format(amount);
	}

}
