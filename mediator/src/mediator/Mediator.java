package mediator;

import domain.Clock;
import domain.CoffeeMaker;
import domain.Lamp;
import domain.MovementSensor;
import domain.Radio;

public class Mediator {
	
	private Clock clock = new Clock(this);
	private Lamp lamp = new Lamp(this);
	private Radio radio = new Radio(this);
	private CoffeeMaker coffeeMaker = new CoffeeMaker(this);
	private MovementSensor movementSensor = new MovementSensor(this);
	
	public void morningAlarm() {
		coffeeMaker.makeCoffee();
		lamp.setIntensity(50);
		radio.setVolume(100);
	}

	public void coffeeReady() {
		lamp.setIntensity(100);
		radio.setVolume(1000);
	}

	public void movementDetected() {
		lamp.setIntensity(20);
		radio.setVolume(50);
	}

	public Clock getClock() {
		return clock;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public Radio getRadio() {
		return radio;
	}

	public CoffeeMaker getCoffeeMaker() {
		return coffeeMaker;
	}

	public MovementSensor getMovementSensor() {
		return movementSensor;
	}
	
}
