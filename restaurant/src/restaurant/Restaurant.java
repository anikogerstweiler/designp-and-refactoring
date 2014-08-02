package restaurant;

import java.util.LinkedList;
import java.util.List;

public class Restaurant {

	public static void main(String[] args) {
		List<Order> orders = new LinkedList<>();

		orders.add(new Order.Builder()
			.customer(new Customer("Sanyi", 10))
			.product(new HotDog())
			.withKetchup()
			.build());

		orders.add(new Order.Builder()
			.customer(new Customer("Pumi", 10))
			.product(new HotDog())
			.withMustard()
			.build());

		orders.add(new Order.Builder()
			.customer(new Customer("SpongyaBob", 10))
			.product(new Chips())
			.withKetchup()
			.build());

		orders.add(new Order.Builder()
			.customer(new Customer("Patrik", 10))
			.product(new Chips())
			.withMustard()
			.build());

		Customer joe = new Customer("Joe", 10);
		orders.add(new Order.Builder()
			.customer(joe)
			.product(new HotDog())
			.build());

		orders.add(new Order.Builder()
			.customer(joe)
			.product(new HotDog())
			.build());

		for (Order order : orders) {
			System.out.println(order.toString() + "'s happiness: " + order.deliver());
		}

	}

}
