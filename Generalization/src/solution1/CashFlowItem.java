package solution1;

import java.math.BigDecimal;
import java.util.Date;

/**
 * A single Cash Flow item.
 */
public class CashFlowItem {

	private BigDecimal amount;

	private Date date;

	/**
	 * @param date
	 *            Date of the item.
	 * @param amount
	 *            Amount of the item.
	 * 
	 * @throws IllegalArgumentException
	 *             One or more parameters are null.
	 */
	public CashFlowItem(Date date, BigDecimal amount) {
		validateDate(date);
		
		validateAmount(amount);
		
		this.date = date;
		this.amount = amount;
	}

	private void validateAmount(BigDecimal amount) {
		if (amount == null) {
			throw new IllegalArgumentException("Parameter amount cannot be null.");
		}
	}

	private void validateDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("Parameter date cannot be null.");
		}
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}

}
