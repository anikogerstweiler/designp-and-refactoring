package model;

import java.math.BigDecimal;

public interface CashFlowBuilder {
	void addExpense(int year, int month, int day, BigDecimal amount);

	void addIncome(int year, int month, int day, BigDecimal amount);

	CashFlow getCashFlow();

	void setRate(BigDecimal rate);

}
