
package patterns.command;

/**
 * Context Class.
 */
public final class Context extends AbstractContext {

	/**
	 * single instance within classLoader.
	 */
	private static ContextInterface instance;

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
	public static synchronized ContextInterface getInstance() {
		if (instance == null) {
			instance = Context.create();
		}
		return instance;
	}

	/**
	 * Creates the.
	 *
	 * @return the context interface
	 */
	public static ContextInterface create() {
		final ContextInterface context = new Context();
		return context;
	}
}
