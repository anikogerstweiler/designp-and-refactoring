package builder;

import java.math.BigDecimal;

import model.CashFlow;

public interface CashFlowBuilder {
	
	void setRate(BigDecimal rate);
	
	void addExpense(int year, int month, int day, BigDecimal amount);
	
	void addIncome(int year, int month, int day, BigDecimal amount);
	
	CashFlow getCashFlow();
}
