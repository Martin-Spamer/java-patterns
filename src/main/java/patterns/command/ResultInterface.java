package patterns.command;

/**
 * Result Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * @return the result interface
	 */
	Boolean result();

	boolean and(ResultInterface execute);

}
