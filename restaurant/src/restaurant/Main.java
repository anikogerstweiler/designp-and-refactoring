package restaurant;

public class Main {

	public static void main(String[] args) {
		{
			System.out.println("Hotdog + ketchup");
			int happiness = 10;
			HotDog hotDog = new HotDog();
			Ketchup ketchup = new Ketchup(hotDog);
			System.out.println(ketchup.calculateEffect(happiness));
		}

		{
			System.out.println("chips + ketchup");
			int happiness = 10;
			Chips chips = new Chips();
			Ketchup ketchup = new Ketchup(chips);
			System.out.println(ketchup.calculateEffect(happiness));
		}

		{
			System.out.println("chips + mustard");
			int happiness = 10;
			Chips chips = new Chips();
			Mustard mustard = new Mustard(chips);
			System.out.println(mustard.calculateEffect(happiness));
		}

		{
			System.out.println("hotdog + mustard");
			int happiness = 10;
			HotDog hotDog = new HotDog();
			Mustard mustard = new Mustard(hotDog);
			System.out.println(mustard.calculateEffect(happiness));
		}


	}

}
