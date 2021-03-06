package model;

import java.math.BigDecimal;
import java.util.List;

public abstract class CashFlow {

	protected static final int PRECISION = 10;

	protected List<CashFlowItem> cashFlowItems;

	protected BigDecimal rate;

	public CashFlow(BigDecimal rate, List<CashFlowItem> cashFlowItems) {
		if (rate == null) {
			throw new IllegalArgumentException("Parameter rate cannot be null.");
		}
		if (cashFlowItems == null) {
			throw new IllegalArgumentException("Parameter CashFlowItems cannot be null.");
		}
		this.cashFlowItems = cashFlowItems;
		this.rate = rate;
	}

	public abstract BigDecimal discountedValue();

}