package patterns.command;

/**
 * Interface for Invoker for the GOF Command Pattern.
 */
public interface InvokerInterface {

	/**
	 * Execute.
	 *
	 * @param actionName the action name
	 * @return the result interface
	 * @throws MissingCommandException
	 */
	public ResultInterface execute(String actionName) throws MissingCommandException;

}
