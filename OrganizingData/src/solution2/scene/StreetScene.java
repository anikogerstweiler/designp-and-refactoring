package solution2.scene;

public class StreetScene extends Scene {

	@Override
	protected Scene falseScene() {
		return this;
	}

	@Override
	protected Scene trueScene() {
		return new BuildingScene();
	}

	@Override
	public String question() {
		return "You are in the street with a dead body on the floor drowned in blood.\n You should enter the building...\n Enter building?";
	}

}
