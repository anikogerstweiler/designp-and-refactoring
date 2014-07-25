package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DayCashFlowBuilder implements CashFlowBuilder {
	private Integer inputYear = null;
	private BigDecimal rate;
	private List<CashFlowItem> items = new ArrayList<CashFlowItem>();

	@Override
	public void addExpense(int year, int month, int day, BigDecimal amount) {
		checkDate(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount.negate()));
	}

	@Override
	public void addIncome(int year, int month, int day, BigDecimal amount) {
		checkDate(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount));
	}

	private void checkDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getDate(year, month, day));
		if (inputYear == null) {
			inputYear = cal.get(Calendar.YEAR);
		}

		if (!inputYear.equals(cal.get(Calendar.YEAR))) {
			throw new IllegalArgumentException("DailyCashFlow only accepts items from a single year.");
		}
	}

	@Override
	public DayCashFlow getCashFlow() {
		return new DayCashFlow(rate, items);
	}

	protected Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}

	@Override
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
