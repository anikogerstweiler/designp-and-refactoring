package formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EuroFormatter {

	private NumberFormat formatter;

	public EuroFormatter() {
		this.formatter = new DecimalFormat();
	}

	public String format(BigDecimal amount) {
		return "EUR " + formatter.format(amount);
	}

}
