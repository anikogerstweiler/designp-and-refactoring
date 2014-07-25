package solution1;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class DayCashFlowTest {

	@Test
	public void test() {
		CashFlowBuilder cashFlowBuilder = new DayCashFlowBuilder();
		cashFlowBuilder.addIncome(2013, 0, 1, new BigDecimal("100"));
		cashFlowBuilder.addIncome(2013, 8, 1, new BigDecimal("100"));
		cashFlowBuilder.addIncome(2013, 5, 1, new BigDecimal("100"));
		cashFlowBuilder.setRate(new BigDecimal("0.1"));
		CashFlow cf = cashFlowBuilder.getCashFlow();
		Assert.assertEquals(new BigDecimal("289.79"), cf.discountedValue());
	}

}
