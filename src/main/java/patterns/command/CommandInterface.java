
package patterns.command;

/**
 * Command Interface from GOF Command Pattern.
 */
public interface CommandInterface {

	/**
	 * Execute.
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	public ResultInterface execute(ParametersInterface commandParameters);

	/**
	 * Undo.
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	public ResultInterface undo(ParametersInterface commandParameters);

	/**
	 * Result.
	 *
	 * @return the boolean
	 */
	public Boolean result();

}
