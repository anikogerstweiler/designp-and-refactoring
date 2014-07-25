package exercise2;

public class Scene {

	private int id;

	public Scene() {
		this.id = 0;
	}

	public Scene(int id) {
		this.id = id;
	}

	public String question() {
		switch (id) {
		case 0:
			return "Welcome! \n You are now in the street with a dead body on the floor drowned in blood \n there is a building right ahead of you\n Enter building?";
		case 1:
			return "You entered in the building.\n There is a dragon.\n Attack?";
		case 2:
			return "Unfortunately, you died :(\n New game?";
		case 3:
			return "You are in the street with a dead body on the floor drowned in blood.\n You should enter the building...\n Enter building?";
		case 4:
			return "Congratulations, you win :) \n New game?";
		case 5:
			return "Good bye!";
		}
		return "ERROR!";
	}

	public Scene next(boolean answer) {
		if (answer) {
			switch (id) {
			case 0:
				return new Scene(1);
			case 1:
				return new Scene(2);
			case 2:
				return new Scene(0);
			case 3:
				return new Scene(1);
			case 4:
				return new Scene(0);
			}
		} else {
			switch (id) {
			case 0:
				return new Scene(3);
			case 1:
				return new Scene(4);
			case 2:
				return new Scene(5);
			case 3:
				return new Scene(3);
			case 4:
				return new Scene(5);
			}
		}
		return new Scene(-1);
	}

	public boolean exit() {
		switch (id) {
		case 0:
			return false;
		case 1:
			return false;
		case 2:
			return false;
		case 3:
			return false;
		case 4:
			return false;
		case 5:
			return true;
		}
		return false;
	}
}
