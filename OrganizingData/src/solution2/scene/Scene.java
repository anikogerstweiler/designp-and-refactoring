package solution2.scene;

public abstract class Scene {

	public Scene next(boolean answer) {
		Scene nextScene;
		if (answer) {
			nextScene = trueScene();
		} else {
			nextScene = falseScene();
		}
		return nextScene;
	}

	protected abstract Scene falseScene();

	protected abstract Scene trueScene();

	public abstract String question();

	public boolean exit() {
		return false;
	}
}
