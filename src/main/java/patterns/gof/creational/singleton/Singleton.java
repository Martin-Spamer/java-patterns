
package patterns.gof.creational.singleton;

/**
 * The Singleton Class.
 */
public class Singleton {

	/** The instance. */
	private static Singleton instance;

	/**
	 * Private Constructor prevents wild instantiation of singleton.
	 */
	private Singleton() {
	}

	/**
	 * Gets the single instance of Singleton.
	 *
	 * @return single instance of Singleton
	 */
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = create();
		}
		return instance;
	}

	/**
	 * Creates the.
	 *
	 * @return the singleton
	 */
	private static Singleton create() {
		return new Singleton();
	}

}
