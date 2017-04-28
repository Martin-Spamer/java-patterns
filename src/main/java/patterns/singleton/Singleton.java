package patterns.singleton;

/**
 * Singleton Pattern with late instantiation .
 */
public class Singleton {

	private static Singleton instance;

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
	}

	/**
	 * Gets the single instance of Singleton.
	 *
	 * @return single instance of Singleton
	 */
	public synchronized static Singleton getInstance() {
		instance = new Singleton();
		return instance;
	}

	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
