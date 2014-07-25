package formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class DollarFormatter {

	private NumberFormat formatter;

	public DollarFormatter() {
		this.formatter = NumberFormat.getCurrencyInstance(Locale.US);
	}

	public String format(BigDecimal amount) {
		return formatter.format(amount);
	}

}
