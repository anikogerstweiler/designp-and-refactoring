package formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatter {
	private NumberFormat formatter;

	public DecimalFormatter() {
		this.formatter = new DecimalFormat();
	}

	public String format(BigDecimal amount) {
		return formatter.format(amount);
	}

}
