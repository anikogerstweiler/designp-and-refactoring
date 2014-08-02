package restaurant;

public class Main {

	public static void main(String[] args) {
		{
			System.out.println("Hotdog + ketchup");
			int happiness = 10;
			HotDog hotDog = new HotDog(happiness);
			Ketchup ketchup = new Ketchup(hotDog);
			System.out.println(ketchup.changeEffect());
		}
		
		{
			System.out.println("chips + ketchup");
			int happiness = 10;
			Chips chips = new Chips(happiness);
			Ketchup ketchup = new Ketchup(chips);
			System.out.println(ketchup.changeEffect());
		}
		

	}

}
