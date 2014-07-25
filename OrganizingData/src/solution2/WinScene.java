package solution2;

import solution2.scene.ByeScene;
import solution2.scene.Scene;
import solution2.scene.WelcomeScene;

public class WinScene extends Scene {

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
		return "Congratulations, you win :) \n New game?";
	}

}
