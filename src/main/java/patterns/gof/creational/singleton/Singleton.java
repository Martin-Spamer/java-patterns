package patterns.gof.creational.singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = create();
		}
		return instance;
	}

	private static Singleton create() {
		return new Singleton();
	}

}
