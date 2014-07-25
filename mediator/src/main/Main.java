package main;

import mediator.Mediator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Mediator mediator = new Mediator();
		
		mediator.getClock().setTime(7, 0);
		Thread.sleep(1000);
		mediator.getClock().setTime(7, 30);
		Thread.sleep(5000);
		
		mediator.getMovementSensor().movementDetected();
	}

}
