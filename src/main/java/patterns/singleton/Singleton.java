
package patterns.singleton;

/**
 * Singleton Class.
 */
public final class Singleton {

	private static Singleton instance;

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
		super();
	}

	/**
	 * single instance of Singleton.
	 *
	 * @return single instance of Singleton
	 */
	public synchronized static Singleton getInstance() {
		instance = new Singleton();
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
