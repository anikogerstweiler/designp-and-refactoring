package formatter;

import java.math.BigDecimal;
import java.util.Date;

public class Formatter {
	
	private static DollarFormatter dollarFormatter = new DollarFormatter();
	private static EuroFormatter euroFormatter = new EuroFormatter();
	private static HufFormatter hufFormatter = new HufFormatter();
	
	private static DecimalFormatter decimalFormatter = new DecimalFormatter();
	private static IntegerFormatter integerFormatter = new IntegerFormatter();
	private static PercentFormatter percentFormatter = new PercentFormatter();
	
	private static DateLongFormatter dateLongFormatter = new DateLongFormatter();
	private static DateShortFormatter dateShortFormatter = new DateShortFormatter();
	
	public static String formatDollar(BigDecimal amount) {
		return dollarFormatter.format(amount);
	}
	
	public static String formatEuro(BigDecimal amount) {
		return euroFormatter.format(amount);
	}
	
	public static String formatHuf(BigDecimal amount) {
		return hufFormatter.format(amount);
	}
	
	public static String formatDecimal(BigDecimal amount) {
		return decimalFormatter.format(amount);
	}
	
	public static String formatInteger(BigDecimal amount) {
		return integerFormatter.format(amount);
	}
	
	public static String formatPercent(BigDecimal amount) {
		return percentFormatter.format(amount);
	}
	
	public static String formatDateLong(Date date) {
		return dateLongFormatter.format(date);
	}
	
	public static String formatDateShort(Date date) {
		return dateShortFormatter.format(date);
	}
}
