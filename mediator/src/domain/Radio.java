package domain;

import mediator.Mediator;

public class Radio extends HomeElement {

	private int volume = 0;
	
	public Radio(Mediator mediator) {
		super(mediator);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Radio volume: " + volume);
	}

}
