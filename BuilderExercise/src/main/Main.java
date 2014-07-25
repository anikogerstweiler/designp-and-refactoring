package main;

import java.math.BigDecimal;

import builder.CashFlowBuilder;
import builder.DayCashFlowBuilder;
import builder.YearCashFlowBuilder;

public class Main {

	public static void main(String[] args) {
		{
			CashFlowBuilder builder = new YearCashFlowBuilder();
			builder.setRate(new BigDecimal(0.1));
			builder.addIncome(2015, 1, 1, new BigDecimal("100"));
			builder.addIncome(2016, 1, 1, new BigDecimal("100"));
			builder.addIncome(2017, 1, 1, new BigDecimal("100"));
			System.out.println(builder.getCashFlow().discountedValue().toString());
		}
		
		{
			CashFlowBuilder builder = new DayCashFlowBuilder();
			builder.setRate(new BigDecimal(0.1));
			builder.addIncome(2014, 1, 1, new BigDecimal("100"));
			builder.addIncome(2014, 9, 1, new BigDecimal("100"));
			builder.addIncome(2014, 6, 1, new BigDecimal("100"));
			System.out.println(builder.getCashFlow().discountedValue().toString());
		}
	}

}
