package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * A calculator class for year based cash flow items.<br>
 * <br>
 * Example for calculation: <br>
 * 
 * Current year (2013) <br>
 * Rate (0.1) <br>
 * CashFlowItem (2014.01.01, +100) <br>
 * CashFlowItem (2015.01.01, +100) <br>
 * CashFlowItem (2016.01.01, +100) <br>
 * <br>
 * Results: 248.69
 * 
 */
public class YearCashFlow extends CashFlow {

	/**
	 * 
	 * Attention! Implementation only works for future items with date 01.01.
	 * 
	 * @param rate
	 *            The interest rate.
	 * @param cashFlowItems
	 *            Items for 01.01 of different years.
	 * 
	 */
	public YearCashFlow(BigDecimal rate, List<CashFlowItem> cashFlowItems) {
		super(rate, cashFlowItems);
	}

	/**
	 * Calculates discounted value for the beginning of the current year.
	 */
	@Override
	public BigDecimal discountedValue() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		BigDecimal sum = BigDecimal.ZERO;
		for (CashFlowItem item : cashFlowItems) {
			cal.setTime(item.getDate());
			int itemYear = cal.get(Calendar.YEAR);
			BigDecimal ratePlusOne = rate.add(BigDecimal.ONE);
			BigDecimal discountRate = ratePlusOne.pow(itemYear - year);
			BigDecimal discountedItem = item.getAmount().divide(discountRate, PRECISION, RoundingMode.HALF_UP);
			sum = sum.add(discountedItem);
		}

		return sum.setScale(2, RoundingMode.HALF_UP);
	}

}
