package domain;

import mediator.Mediator;

public abstract class HomeElement {
	
	protected Mediator mediator;

	public HomeElement(Mediator mediator) {
		this.mediator = mediator;
	}
	
	
}
