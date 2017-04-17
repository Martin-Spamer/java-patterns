package patterns.singleton;

/**
 * The StaticSingleton Class.
 */
public class StaticSingleton {

	/** The instance. */
	private static StaticSingleton instance = new StaticSingleton();

	/**
	 * Instantiates a new static singleton.
	 */
	private StaticSingleton() {
	}

	/**
	 * Gets the single instance of StaticSingleton.
	 *
	 * @return single instance of StaticSingleton
	 */
	public synchronized static StaticSingleton getInstance() {
		return instance;
	}

}
