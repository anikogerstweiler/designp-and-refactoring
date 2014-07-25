package formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HufFormatter {

	private NumberFormat formatter;

	public HufFormatter() {
		this.formatter = new DecimalFormat();
	}

	public String format(BigDecimal amount) {
		return "HUF " + formatter.format(amount);
	}

}
