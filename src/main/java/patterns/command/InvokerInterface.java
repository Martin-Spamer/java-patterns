
package patterns.command;

/**
 * GOF Command Pattern.
 */
public interface InvokerInterface {

	/**
	 * Execute.
	 *
	 * action name
	 * result interface
	 * missing command exception
	 *
	 * @param actionName the action name
	 * @return the result interface
	 * @throws MissingCommandException the missing command exception
	 */
	public ResultInterface execute(String actionName) throws MissingCommandException;

}
