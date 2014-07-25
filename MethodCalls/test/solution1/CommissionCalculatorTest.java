package solution1;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class CommissionCalculatorTest {

	@Test
	public void testCalculateCommissionShortTerm() {
		CommissionCalculator cc = CommissionCalculator.createShort();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("0.0098630137"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTerm() {
		CommissionCalculator cc = CommissionCalculator.createOneYear();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTerm() {
		CommissionCalculator cc = CommissionCalculator.createLong();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermForPeriod() {
		CommissionCalculator cc = CommissionCalculator.createShort();
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("0.0098630137"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermForPeriod() {
		CommissionCalculator cc = CommissionCalculator.createOneYear();
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermForPeriod() {
		CommissionCalculator cc = CommissionCalculator.createLong();
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermZeroDays() {
		CommissionCalculator cc = CommissionCalculator.createShort();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("0.0000000000"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermZeroDays() {
		CommissionCalculator cc = CommissionCalculator.createOneYear();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermZeroDays() {
		CommissionCalculator cc = CommissionCalculator.createLong();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermTenYears() {
		CommissionCalculator cc = CommissionCalculator.createShort();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("5.9836065574"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermTenYears() {
		CommissionCalculator cc = CommissionCalculator.createOneYear();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermTenYears() {
		CommissionCalculator cc = CommissionCalculator.createLong();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}
}
