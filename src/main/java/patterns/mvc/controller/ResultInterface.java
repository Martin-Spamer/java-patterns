
package patterns.mvc.controller;

/**
 * The ResultInterface Interface.
 */
public interface ResultInterface {

	/**
	 * Result.
	 *
	 * @return the result interface
	 */
	ResultInterface result();

	/**
	 * Update result.
	 *
	 * @param newResult the new result
	 * @return the result interface
	 */
	ResultInterface updateResult(ResultInterface newResult);

}