package main;

import java.math.BigDecimal;

public class Command {

	private static long autoIncrement = 1;
	
	private String account;
	
	private BigDecimal balance;
	
	private long id;
	
	public Command(String account, BigDecimal balance) {
		this.account = account;
		this.balance = balance;
		this.id = autoIncrement;
		autoIncrement++;
	}

	public void execute(Accounting accounting) {
		accounting.addBookEntry(account, balance);
	}
	
	public void undo(Accounting accounting) {
		accounting.cancelBookEntry(account, balance);
	}

	public long getId() {
		return id;
	}
}
