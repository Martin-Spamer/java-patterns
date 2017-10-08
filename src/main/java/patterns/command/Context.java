


package patterns.command;

/**
 * Context Class.
 */
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
	 * single instance.
	 *
	 * @return single instance of Context
	 *         single instance
	 */
	public static Context getInstance() {
		return instance;
	}

}
