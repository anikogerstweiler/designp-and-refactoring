package solution1;

import java.math.BigDecimal;
import java.util.List;

public abstract class CashFlow {

	protected static final int PRECISION = 10;

	protected List<CashFlowItem> cashFlowItems;

	protected BigDecimal rate;

	public CashFlow(BigDecimal rate, List<CashFlowItem> cashFlowItems) {
		validateRate(rate);
		
		validateCashFlowItem(cashFlowItems);
		
		this.cashFlowItems = cashFlowItems;
		this.rate = rate;
	}

	private void validateCashFlowItem(List<CashFlowItem> cashFlowItems) {
		if (cashFlowItems == null) {
			throw new IllegalArgumentException("Parameter CashFlowItems cannot be null.");
		}
	}

	private void validateRate(BigDecimal rate) {
		if (rate == null) {
			throw new IllegalArgumentException("Parameter rate cannot be null.");
		}
	}

	public abstract BigDecimal discountedValue();

}