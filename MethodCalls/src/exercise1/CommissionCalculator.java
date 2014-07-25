package exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

public class CommissionCalculator {

	public enum Term {
		SHORT, ONE_YEAR, LONG
	}

	private BigDecimal rate;

	private BigDecimal lowerLimit;

	private BigDecimal upperLimit;

	public CommissionCalculator(Term term) {
		switch (term) {
		case SHORT:
			rate = new BigDecimal("0.006");
			lowerLimit = new BigDecimal("0");
			upperLimit = new BigDecimal("6000");
			break;
		case ONE_YEAR:
			rate = new BigDecimal("0.003");
			lowerLimit = new BigDecimal("100");
			upperLimit = new BigDecimal("3000");
			break;
		case LONG:
			rate = new BigDecimal("0.001");
			lowerLimit = new BigDecimal("100");
			upperLimit = new BigDecimal("500");
			break;
		}
	}

	public BigDecimal calculateCommission(BigDecimal amount, Date periodStart, Date periodEnd, boolean isLeapYear) {
		BigDecimal yearLength = new BigDecimal("365");
		if (isLeapYear) {
			yearLength = new BigDecimal("366");
		}

		int dayDifference = dayDifference(periodStart, periodEnd);
		BigDecimal commission = amount.multiply(rate).multiply(new BigDecimal(dayDifference)).divide(yearLength, 10, RoundingMode.HALF_UP);

		if (commission.compareTo(lowerLimit) < 0) {
			commission = lowerLimit;
		}

		if (commission.compareTo(upperLimit) > 0) {
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
		}

		if (commission.compareTo(upperLimit) > 0) {
			commission = upperLimit;
		}
		return commission;
	}

	private int dayDifference(Date periodStart, Date periodEnd) {
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.setTime(periodStart);
		calendar2.setTime(periodEnd);
		long milliseconds1 = calendar1.getTimeInMillis();
		long milliseconds2 = calendar2.getTimeInMillis();
		long diff = milliseconds2 - milliseconds1;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		return (int) diffDays;
	}

}
