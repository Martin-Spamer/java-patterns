package patterns.command;

public class Context {

	/**
	 * single instance within classLoader.
	 */
	private static Context instance = new Context();

	/**
	 * Constructor is private to prevent wild construction.
	 */
	private Context() {
		super();
	}

	/**
	 * Returns the single instance.
	 *
	 * @returns The single instance
	 */
	public static Context getInstance() {
		return instance;
	}

}
