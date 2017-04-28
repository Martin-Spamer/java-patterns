package patterns.singleton;

/**
 * Singleton Pattern with Static construction.
 */
public class StaticSingleton {

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

	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
