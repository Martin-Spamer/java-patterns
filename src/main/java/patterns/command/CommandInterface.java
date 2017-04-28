
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
	 * @return the command interface
	 */
	abstract CommandInterface execute(ParametersInterface commandParameters);

	/**
	 * Undo.
	 *
	 * @param commandParameters the command parameters
	 * @return the command interface
	 */
	abstract CommandInterface undo(ParametersInterface commandParameters);

	/**
	 * Result.
	 *
	 * @return the result interface
	 */
	abstract ResultInterface result();
}
