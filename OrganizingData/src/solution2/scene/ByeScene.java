package solution2.scene;

public class ByeScene extends Scene {

	@Override
	protected Scene falseScene() {
		throw new IllegalStateException();
	}

	@Override
	protected Scene trueScene() {
		throw new IllegalStateException();
	}

	@Override
	public String question() {
		return "Good bye!";
	}

	@Override
	public boolean exit() {
		return true;
	}

}
