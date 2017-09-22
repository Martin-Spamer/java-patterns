

package patterns.command;

/**
 * Result Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * result interface
	 *
	 * @return the boolean
	 */
	Boolean result();

	/**
	 * And.
	 *
	 * execute
	 *
	 * @param execute the execute
	 * @return true, if successful
	 */
	boolean and(ResultInterface execute);

}
