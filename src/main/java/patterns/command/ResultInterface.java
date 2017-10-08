



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
	public Boolean result();

	/**
	 * And.
	 *
	 * @param execute the execute
	 * @return true, if successful
	 */
	public boolean and(ResultInterface execute);

}
