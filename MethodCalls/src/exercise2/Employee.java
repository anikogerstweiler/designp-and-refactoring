package exercise2;

public class Employee {

	public enum Type {
		ENGINEER("ENGINEER"), SALESMAN("ENGINEER"), MANAGER("MANAGER");
		
		private String name;
		
		private Type(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		};
	}
	
	private Type type;

	public Employee(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return type.toString();
	}

}
