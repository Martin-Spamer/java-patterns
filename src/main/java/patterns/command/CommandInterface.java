
package patterns.command;

/**
 * Command Interface from GOF Command Pattern.
 */
public interface CommandInterface {

	/**
	 * Execute.
	 *
	 * command parameters
	 * result interface
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	abstract ResultInterface execute(ParametersInterface commandParameters);

	/**
	 * Undo.
	 *
	 * command parameters
	 * result interface
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	abstract ResultInterface undo(ParametersInterface commandParameters);

	/**
	 * Result.
	 *
	 * result interface
	 *
	 * @return the boolean
	 */
	abstract Boolean result();

}
