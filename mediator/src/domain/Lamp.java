package domain;

import mediator.Mediator;

public class Lamp extends HomeElement {

	private int intensity = 0;
	
	public Lamp(Mediator mediator) {
		super(mediator);
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
		System.out.println("Lamp intensity: " + intensity);
	}

}
