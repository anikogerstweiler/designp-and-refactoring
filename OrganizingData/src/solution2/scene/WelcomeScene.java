package solution2.scene;

public class WelcomeScene extends Scene {
	
	@Override
	public String question() {
		return "Welcome! \n You are now in the street with a dead body on the floor drowned in blood \n there is a building right ahead of you\n Enter building?";
	}

	@Override
	public boolean exit() {
		return false;
	}

	@Override
	protected Scene falseScene() {
		return new StreetScene();
	}

	@Override
	protected Scene trueScene() {
		return new BuildingScene();
	}

}
