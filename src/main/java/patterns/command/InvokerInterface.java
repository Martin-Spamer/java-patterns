
package patterns.command;

import patterns.mvc.controller.ResultInterface;

/**
 * The InvokerInterface Interface.
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