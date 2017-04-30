
package patterns.command;

import patterns.mvc.controller.ResultInterface;

/**
 * The CommandInterface Interface.
 */
public interface CommandInterface {

	/**
	 * Execute.
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	abstract ResultInterface execute(ParametersInterface commandParameters);

	/**
	 * Undo.
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	abstract ResultInterface undo(ParametersInterface commandParameters);

	/**
	 * Result.
	 *
	 * @param resultInterface the result interface
	 * @return the result interface
	 */
	abstract ResultInterface result(ResultInterface resultInterface);

}
