package solution1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

public class CommissionCalculator {

	private static final int DAY_IN_MILLISECONDS = 24 * 60 * 60 * 1000;

	private BigDecimal rate;

	private BigDecimal lowerLimit;

	private BigDecimal upperLimit;

	public static CommissionCalculator createShort() {
		return new CommissionCalculator("0.006", "0","6000");
	}
	
	public static CommissionCalculator createOneYear() {
		return new CommissionCalculator("0.003", "100","3000");
	}
	
	public static CommissionCalculator createLong() {
		return new CommissionCalculator("0.001", "100","500");
	}
	
	private CommissionCalculator(String rate, String lowerLimit, String upperLimit) {
		this.rate = new BigDecimal(rate);
		this.lowerLimit = new BigDecimal(lowerLimit);
		this.upperLimit = new BigDecimal(upperLimit);
	}

	public CommissionCalculator() {	}

	public BigDecimal calculateCommission(BigDecimal amount, Date periodStart, Date periodEnd, boolean isLeapYear) {
		BigDecimal yearLength = new BigDecimal("365");
		if (isLeapYear) {
			yearLength = new BigDecimal("366");
		}

		int dayDifference = dayDifference(periodStart, periodEnd);
		BigDecimal commission = amount.multiply(rate).multiply(new BigDecimal(dayDifference)).divide(yearLength, 10, RoundingMode.HALF_UP);

		if (commission.compareTo(lowerLimit) < 0) {
			commission = lowerLimit;
		} else if (commission.compareTo(upperLimit) > 0) {
			commission = upperLimit;
		}
		return commission;
	}

	public BigDecimal calculateCommission(BigDecimal amount, int dayDifference, boolean isLeapYear) {
		BigDecimal yearLength = new BigDecimal("365");
		if (isLeapYear) {
			yearLength = new BigDecimal("366");
		}

		BigDecimal commission = amount.multiply(rate).multiply(new BigDecimal(dayDifference)).divide(yearLength, 10, RoundingMode.HALF_UP);

		if (commission.compareTo(lowerLimit) < 0) {
			commission = lowerLimit;
		} else if (commission.compareTo(upperLimit) > 0) {
			commission = upperLimit;
		}
		return commission;
	}

	private int dayDifference(Date periodStart, Date periodEnd) {
		long diff = getTimeStamp(periodEnd) - getTimeStamp(periodStart);
		
		return (int) (diff / DAY_IN_MILLISECONDS);
	}

	private long getTimeStamp(Date date) {
		Calendar.getInstance().setTime(date);
		
		return Calendar.getInstance().getTimeInMillis();
	}

}
