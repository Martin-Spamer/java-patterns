
package patterns.command;

/**
 * Context Class.
 */
public class Context extends AbstractContext {

	/**
	 * single instance within classLoader.
	 */
	private static ContextInterface instance = new Context();

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
		return instance;
	}

	public static ContextInterface create() {
		return new Context();
	}
}
