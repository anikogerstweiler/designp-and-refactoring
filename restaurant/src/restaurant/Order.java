package restaurant;

public class Order {
	private Product product;
	private Customer customer;

	public Order(Customer customer, Product product) {
		this.customer = customer;
		this.product = product;
	}

	public double deliver() {
		return customer.eat(product.calculateEffect(customer.getHappiness()));
	}

	@Override
	public String toString() {
		return "Order [" + product + "], " + customer;
	}

	public static class Builder {
		private Product product;
		private Customer customer;

		public Builder product(Product product) {
			this.product = product;
			return this;
		}

		public Builder customer(Customer customer) {
			this.customer = customer;
			return this;
		}

		public Builder withKetchup() {
			this.product = new Ketchup(product);
			return this;
		}

		public Builder withMustard() {
			this.product = new Mustard(product);
			return this;
		}

		public Order build() {
			return new Order(customer, product);
		}
	}


}
