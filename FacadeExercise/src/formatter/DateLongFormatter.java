package formatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLongFormatter {
	private SimpleDateFormat formatter;

	public DateLongFormatter() {
		this.formatter = new SimpleDateFormat("yyyy.MMMM.dd");
	}

	public String format(Date date) {
		return formatter.format(date);
	}
}
