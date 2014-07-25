package formatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateShortFormatter {
	private SimpleDateFormat formatter;

	public DateShortFormatter() {
		this.formatter = new SimpleDateFormat("yyyy.MM.dd");
	}

	public String format(Date date) {
		return formatter.format(date);
	}
}
