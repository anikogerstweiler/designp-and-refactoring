package builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.CashFlow;
import model.CashFlowItem;
import model.DayCashFlow;

public class DayCashFlowBuilder implements CashFlowBuilder {
	
	private List<CashFlowItem> cashFlowItems = new ArrayList<>();
	
	private BigDecimal rate;

	private int year;
	
	@Override
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Override
	public CashFlow getCashFlow() {
		return new DayCashFlow(rate, cashFlowItems);
	}

	@Override
	public void addExpense(int year, int month, int day, BigDecimal amount) {
		validateDate(year, month, day);
		
		Date date = creteDate(year, month, day);
		
		CashFlowItem item = new CashFlowItem(date , amount.negate());
		cashFlowItems.add(item);
	}

	private Date creteDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DATE, day);
		
		return calendar.getTime();
	}

	private void validateDate(int year, int month, int day) {
		if (cashFlowItems.isEmpty()) {
			this.year = year;
		} else if (this.year != year) {
			throw new IllegalArgumentException("Items must be from the same year");
		}
	}

	@Override
	public void addIncome(int year, int month, int day, BigDecimal amount) {
		validateDate(year, month, day);
		Date date = creteDate(year, month, day);
		
		CashFlowItem item = new CashFlowItem(date , amount);
		cashFlowItems.add(item);
	}

}
