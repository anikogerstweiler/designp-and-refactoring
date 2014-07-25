package exercise1;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import exercise1.CommissionCalculator.Term;

public class CommissionCalculatorTest {

	@Test
	public void testCalculateCommissionShortTerm() {
		CommissionCalculator cc = new CommissionCalculator(Term.SHORT);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("0.0098630137"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTerm() {
		CommissionCalculator cc = new CommissionCalculator(Term.ONE_YEAR);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTerm() {
		CommissionCalculator cc = new CommissionCalculator(Term.LONG);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 6, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermForPeriod() {
		CommissionCalculator cc = new CommissionCalculator(Term.SHORT);
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("0.0098630137"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermForPeriod() {
		CommissionCalculator cc = new CommissionCalculator(Term.ONE_YEAR);
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermForPeriod() {
		CommissionCalculator cc = new CommissionCalculator(Term.LONG);
		Date date = new Date();
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), new Date(date.getTime() - 6 * 24 * 60 * 60 * 1000), date, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermZeroDays() {
		CommissionCalculator cc = new CommissionCalculator(Term.SHORT);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("0.0000000000"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermZeroDays() {
		CommissionCalculator cc = new CommissionCalculator(Term.ONE_YEAR);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermZeroDays() {
		CommissionCalculator cc = new CommissionCalculator(Term.LONG);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 0, false);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionShortTermTenYears() {
		CommissionCalculator cc = new CommissionCalculator(Term.SHORT);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("5.9836065574"), commission);
	}

	@Test
	public void testCalculateCommissionOneYearTermTenYears() {
		CommissionCalculator cc = new CommissionCalculator(Term.ONE_YEAR);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}

	@Test
	public void testCalculateCommissionLongTermTenYears() {
		CommissionCalculator cc = new CommissionCalculator(Term.LONG);
		BigDecimal commission = cc.calculateCommission(new BigDecimal("100"), 365 * 10, true);
		Assert.assertEquals(new BigDecimal("100"), commission);
	}
}
