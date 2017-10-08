


package patterns.singleton;

/**
 * Singleton Class.
 */
public class Singleton {

	private static Singleton instance;

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
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
