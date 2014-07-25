package solution1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class CashFlowBuilder {
	protected BigDecimal rate;
	protected List<CashFlowItem> items = new ArrayList<CashFlowItem>();

	protected abstract CashFlow getCashFlow();

	protected abstract void checkDate(int year, int month, int day);

	public void addExpense(int year, int month, int day, BigDecimal amount) {
		checkDate(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount.negate()));
	}

	public void addIncome(int year, int month, int day, BigDecimal amount) {
		checkDate(year, month, day);
		items.add(new CashFlowItem(getDate(year, month, day), amount));
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
