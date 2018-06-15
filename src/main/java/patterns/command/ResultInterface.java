
package patterns.command;

/**
 * Result Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * @return the boolean
	 */
	public Boolean getResult();

	/**
	 * And.
	 *
	 * @param execute
	 *            the execute
	 * @return true, if successful, otherwise false.
	 */
	public boolean and(final ResultInterface execute);

}
