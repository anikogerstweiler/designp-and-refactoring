package domain;

import mediator.Mediator;

public class CoffeeMaker extends HomeElement implements Runnable {

	public CoffeeMaker(Mediator mediator) {
		super(mediator);
	}
	
	public void makeCoffee() {
		System.out.println("Making coffee...");
		new Thread(this).start();
	}
	
	private void coffeeReady() {
		System.out.println("Coffee ready!");
		mediator.coffeeReady();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coffeeReady();
	}

}
