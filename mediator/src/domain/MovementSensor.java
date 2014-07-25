package domain;

import mediator.Mediator;

public class MovementSensor extends HomeElement {

	public MovementSensor(Mediator mediator) {
		super(mediator);
	}
	
	public void movementDetected() {
		System.out.println("Movement detected!");
		mediator.movementDetected();
	}

}
