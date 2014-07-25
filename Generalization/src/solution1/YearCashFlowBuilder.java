package solution1;

import java.util.Calendar;
import java.util.Date;

public class YearCashFlowBuilder extends CashFlowBuilder {

	@Override
	protected void checkDate(int year, int month, int day) {
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

}
