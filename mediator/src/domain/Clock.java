package domain;

import mediator.Mediator;

public class Clock extends HomeElement {

	private int hour;
	private int minute;
	
	public Clock(Mediator mediator) {
		super(mediator);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
		System.out.println("actual time " + hour + ":" + minute);
		
		if (hour == 7 && minute == 30) {
			morningAlarm();
		}
	}
	
	private void morningAlarm() {
		mediator.morningAlarm();
	}
	
}
