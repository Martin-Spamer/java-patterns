package patterns.singleton;

/**
 * The Singleton Class.
 */
public class Singleton {

	/** The instance. */
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

}
