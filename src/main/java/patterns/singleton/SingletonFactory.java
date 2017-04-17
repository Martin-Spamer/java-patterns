package patterns.singleton;

/**
 * A factory for creating Singleton objects.
 */
public class SingletonFactory {

	/** The instance. */
	private static SingletonFactory instance;

	/**
	 * Instantiates a new singleton factory.
	 */
	private SingletonFactory() {
	}

	/**
	 * Gets the single instance of SingletonFactory.
	 *
	 * @return single instance of SingletonFactory
	 */
	public synchronized static SingletonFactory getInstance() {
		if (instance == null) {
			instance = create();
		}
		return instance;
	}

	/**
	 * Creates the.
	 *
	 * @return the singleton factory
	 */
	private static SingletonFactory create() {
		return new SingletonFactory();
	}

}
