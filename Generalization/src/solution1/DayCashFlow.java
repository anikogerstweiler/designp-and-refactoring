package solution1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * A calculator class for in year cash flow items.<br>
 * <br>
 * Example for calculation: <br>
 * Rate (0.1) <br>
 * CashFlowItem (YYYY.01.01, +100) <br>
 * CashFlowItem (YYYY.09.01, +100) <br>
 * CashFlowItem (YYYY.06.01, +100) <br>
 * <br>
 * Results: 289.79
 * 
 */
public class DayCashFlow extends CashFlow {

	/**
	 * 
	 * Attention! Implementation only works for items from the same year.
	 * 
	 * @param rate
	 *            The interest rate.
	 * @param cashFlowItems
	 *            Items from the same year.
	 */
	public DayCashFlow(BigDecimal rate, List<CashFlowItem> cashFlowItems) {
		super(rate, cashFlowItems);
	}

	/**
	 * Calculates discounted value for the beginning of the year.
	 */
	@Override
	public BigDecimal discountedValue() {
		Calendar cal = Calendar.getInstance();
		BigDecimal sum = BigDecimal.ZERO;
		for (CashFlowItem item : cashFlowItems) {
			cal.setTime(item.getDate());
			BigDecimal itemRate = rate.divide(new BigDecimal("365.0"), PRECISION, RoundingMode.HALF_UP);
			int days = cal.get(Calendar.DAY_OF_YEAR) - 1;
			BigDecimal discountRate = itemRate.multiply(BigDecimal.valueOf(days));
			BigDecimal discountRatePlusOne = discountRate.add(BigDecimal.ONE);
			BigDecimal discountedItem = item.getAmount().divide(discountRatePlusOne, PRECISION, RoundingMode.HALF_UP);
			sum = sum.add(discountedItem);
		}

		return sum.setScale(2, RoundingMode.HALF_UP);
	}
}
