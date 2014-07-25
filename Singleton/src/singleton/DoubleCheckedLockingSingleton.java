package singleton;


public class DoubleCheckedLockingSingleton {
	private volatile static DoubleCheckedLockingSingleton INSTANCE;

	private DoubleCheckedLockingSingleton() {
		System.out.println("DoubleCheckedLockingSingleton()");
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}

	public static void sfoo() {

	}
}
