
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
	public abstract ResultInterface execute(ParametersInterface commandParameters);

	/**
	 * Undo.
	 *
	 * @param commandParameters the command parameters
	 * @return the result interface
	 */
	public abstract ResultInterface undo(ParametersInterface commandParameters);

	/**
	 * Result.
	 *
	 * @return the boolean
	 */
	public abstract Boolean result();

}
