package main;

import java.math.BigDecimal;
import java.util.Date;

import formatter.Formatter;

public class Main {

	public static void main(String[] args) {
		BigDecimal bigDecimal = BigDecimal.ONE;
		Date date = new Date();
		
		System.out.println("dollar " + Formatter.formatDollar(bigDecimal));
		System.out.println("huf " + Formatter.formatHuf(bigDecimal));
		System.out.println("euro " + Formatter.formatEuro(bigDecimal));
		System.out.println("decimal " + Formatter.formatDecimal(bigDecimal));
		System.out.println("integer " + Formatter.formatInteger(bigDecimal));
		System.out.println("percent " + Formatter.formatPercent(bigDecimal));
		System.out.println("dateLong " + Formatter.formatDateLong(date));
		System.out.println("dateShort " + Formatter.formatDateShort(date));
	}

}
