package main;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Accounting accounting = new Accounting();
		Invoker invoker = new Invoker(accounting);
		
		for (int i = 0; i < 1024; i++) {
			invoker.add(new Command("Bela", new BigDecimal(i)));
		}
		
		System.out.println(accounting.getBalance("Bela"));
		
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(accounting.getBalance("Bela"));
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(accounting.getBalance("Bela"));
		
		invoker.undo(1L);
		System.out.println(accounting.getBalance("Bela"));
		
		invoker.add(new Command("Bela", new BigDecimal(100)));
		invoker.add(new Command("Bela", new BigDecimal(100)));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		invoker.undo(2L);
		System.out.println(accounting.getBalance("Bela"));
	}

}
