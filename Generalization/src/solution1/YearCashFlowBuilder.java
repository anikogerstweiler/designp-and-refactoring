package solution1;

import java.util.Calendar;
import java.util.Date;

public class YearCashFlowBuilder extends CashFlowBuilder {

	@Override
	protected void checkDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getDate(year, month, day));
		
		validateMonth(cal);
		
		validateDayOfMonth(cal);
		
		validateDateIsInFuture(cal);
	}

	private void validateDateIsInFuture(Calendar cal) {
		if (cal.getTime().compareTo(new Date()) < 0) {
			throw new IllegalArgumentException("YearCashFlow only accepts future items");
		}
	}

	private void validateDayOfMonth(Calendar cal) {
		if (cal.get(Calendar.DAY_OF_MONTH) != 1) {
			throw new IllegalArgumentException("YearCashFlow only accepts items for 01.01");
		}
	}

	private void validateMonth(Calendar cal) {
		if (cal.get(Calendar.MONTH) != 0) {
			throw new IllegalArgumentException("YearCashFlow only accepts items for 01.01");
		}
	}

	@Override
	public YearCashFlow getCashFlow() {
		return new YearCashFlow(rate, items);
	}

}
