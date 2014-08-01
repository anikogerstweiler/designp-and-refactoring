package solution1;

import java.math.BigDecimal;
import java.util.Calendar;

public class DayCashFlowBuilder extends CashFlowBuilder {
	
	private Integer inputYear = null;
	
	@Override
	protected void checkDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getDate(year, month, day));
		
		validateYearIsNotNull(cal);

		validateIsTheSameYear(cal);
	}

	private void validateYearIsNotNull(Calendar cal) {
		if (inputYear == null) {
			inputYear = cal.get(Calendar.YEAR);
		}
	}

	private void validateIsTheSameYear(Calendar cal) {
		if (!inputYear.equals(cal.get(Calendar.YEAR))) {
			throw new IllegalArgumentException("DailyCashFlow only accepts items from a single year.");
		}
	}

	@Override
	public DayCashFlow getCashFlow() {
		return new DayCashFlow(rate, items);
	}

	@Override
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
