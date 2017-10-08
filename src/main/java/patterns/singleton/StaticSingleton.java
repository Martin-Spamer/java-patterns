


package patterns.singleton;

/**
 * StaticSingleton Class.
 */
public class StaticSingleton {

	private static StaticSingleton instance = new StaticSingleton();

	/**
	 * Instantiates a new static singleton.
	 */
	private StaticSingleton() {
	}

	/**
	 * single instance of StaticSingleton.
	 *
	 * @return single instance of StaticSingleton
	 */
	public synchronized static StaticSingleton getInstance() {
		return instance;
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
