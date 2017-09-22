

package patterns.mvc.controller;

/**
 * ResultInterface Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * result interface
	 *
	 * @return the result interface
	 */
	ResultInterface result();

	/**
	 * Update result.
	 *
	 * new result
	 * result interface
	 *
	 * @param newResult the new result
	 * @return the result interface
	 */
	ResultInterface updateResult(ResultInterface newResult);

}