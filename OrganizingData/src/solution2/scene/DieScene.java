package solution2.scene;

public class DieScene extends Scene {

	@Override
	protected Scene falseScene() {
		return new ByeScene();
	}

	@Override
	protected Scene trueScene() {
		return new WelcomeScene();
	}

	@Override
	public String question() {
		return "Unfortunately, you died :(\n New game?";
	}

}
