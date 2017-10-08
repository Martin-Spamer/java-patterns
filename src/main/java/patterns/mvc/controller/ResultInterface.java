


package patterns.mvc.controller;

/**
 * Result Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * result interface
	 *
	 * @return the result interface
	 */
	public ResultInterface result();

	/**
	 * Update result.
	 *
	 * new result
	 * result interface
	 *
	 * @param newResult the new result
	 * @return the result interface
	 */
	public ResultInterface updateResult(ResultInterface newResult);

}