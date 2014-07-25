package model;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class YearCashFlowTest {

	@Test
	public void test() {
		YearCashFlowBuilder cashFlowBuilder = new YearCashFlowBuilder();
		cashFlowBuilder.addIncome(2015, 0, 1, new BigDecimal("100"));
		cashFlowBuilder.addIncome(2016, 0, 1, new BigDecimal("100"));
		cashFlowBuilder.addIncome(2017, 0, 1, new BigDecimal("100"));
		cashFlowBuilder.setRate(new BigDecimal("0.1"));
		CashFlow cf = cashFlowBuilder.getCashFlow();
		Assert.assertEquals(new BigDecimal("248.69"), cf.discountedValue());
	}

}
