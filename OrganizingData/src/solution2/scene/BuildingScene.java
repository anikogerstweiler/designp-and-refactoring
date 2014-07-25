package solution2.scene;

import solution2.WinScene;

public class BuildingScene extends Scene {

	@Override
	protected Scene falseScene() {
		return new WinScene();
	}

	@Override
	protected Scene trueScene() {
		return new DieScene();
	}

	@Override
	public String question() {
		return "You entered in the building.\n There is a dragon.\n Attack?";
	}

}
