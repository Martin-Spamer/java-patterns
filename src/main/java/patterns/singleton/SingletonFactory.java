
package patterns.singleton;

/**
 * A factory for creating Singleton objects.
 */
public class SingletonFactory {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
