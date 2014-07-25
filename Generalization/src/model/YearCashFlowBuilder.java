package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class YearCashFlowBuilder implements CashFlowBuilder {
	private BigDecimal rate;
	private List<CashFlowItem> items = new ArrayList<CashFlowItem>();

	@Override
	public void addExpense(int year, int month, int day, BigDecimal amount) {
		checkInput(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount.negate()));
	}

	@Override
	public void addIncome(int year, int month, int day, BigDecimal amount) {
		checkInput(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount));
	}

	private void checkInput(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getDate(year, month, day));
		if (cal.get(Calendar.MONTH) != 0) {
			throw new IllegalArgumentException("YearCashFlow only accepts items for 01.01");
		}
		if (cal.get(Calendar.DAY_OF_MONTH) != 1) {
			throw new IllegalArgumentException("YearCashFlow only accepts items for 01.01");
		}
		if (cal.getTime().compareTo(new Date()) < 0) {
			throw new IllegalArgumentException("YearCashFlow only accepts future items");
		}
	}

	@Override
	public YearCashFlow getCashFlow() {
		return new YearCashFlow(rate, items);
	}

	protected Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
