
package patterns.command;

/**
 * Context Class.
 */
public class Context extends AbstractContext {

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
	public static ContextInterface getInstance() {
		if (instance == null) {
			instance = Context.create();
		}
		return instance;
	}

	public static ContextInterface create() {
		final ContextInterface context = new Context();
		return context;
	}
}
